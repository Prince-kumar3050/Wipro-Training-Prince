package Day4;

public class PatientServiceImpl {
public static void main(String[]args) {
	
}
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


