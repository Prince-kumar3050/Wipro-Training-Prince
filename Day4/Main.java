package Day4;

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

		        PatientServiceImpl service = new PatientServiceImpl();
		        
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


