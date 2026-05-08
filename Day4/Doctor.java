package Day4;

public abstract class Doctor {

	    String name;

	    public void setName(String name) {
	        this.name = name;
	    }

	    abstract void diagnose(Patient p);

}
