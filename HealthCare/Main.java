package HealthCare;

public class Main {
	
	 public static void main(String[] args) {

	        Patient p1 = new Patient();
	        p1.setId(1);
	        p1.setName("Prince");
	        p1.setIllness("Fever");

	        Patient p2 = new Patient();
	        p2.setId(2);
	        p2.setName("Gautam");
	        p2.setIllness("Heart Problem");

	       
	        PatientService service = new PatientServiceImpl();
	        service.registerPatient(p1);
	        service.registerPatient(p2);

	        service.showPatients();

	        
	        Doctor d1 = new GeneralPhysician();
	        d1.setName("Dr. Aryan");

	        Doctor d2 = new Cardiologist();
	        d2.setName("Dr. Raushan");

	        d1.diagnose(p1);
	        d2.diagnose(p2);
	    }
	}

	
	class Patient {
	    private int id;
	    private String name;
	    private String illness;

	    public void setId(int id) { this.id = id; }
	    public void setName(String name) { this.name = name; }
	    public void setIllness(String illness) { this.illness = illness; }

	    public int getId() { return id; }
	    public String getName() { return name; }
	    public String getIllness() { return illness; }
	}

	
	interface PatientService {
	    void registerPatient(Patient p);
	    void showPatients();
	}

	
	class PatientServiceImpl implements PatientService {

	    Patient[] patients = new Patient[10];
	    int count = 0;

	    public void registerPatient(Patient p) {
	        patients[count] = p;
	        count++;
	    }

	    public void showPatients() {
	        for (int i = 0; i < count; i++) {
	            System.out.println(
	                patients[i].getId() + " " +
	                patients[i].getName() + " " +
	                patients[i].getIllness()
	            );
	        }
	    }
	}

	
	abstract class Doctor {
	    String name;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public abstract void diagnose(Patient p);
	}

	
	class GeneralPhysician extends Doctor {
	    public void diagnose(Patient p) {
	        System.out.println("General checkup of " + p.getName());
	    }
	}

	
	class Cardiologist extends Doctor {
	    public void diagnose(Patient p) {
	        System.out.println("Heart specialist checking " + p.getName());
	    }
	}