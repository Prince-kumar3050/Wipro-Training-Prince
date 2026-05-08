package Day4;

public class Patient {
	  private int id;
	    private String name;
	    private String illness;

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setIllness(String illness) {
	        this.illness = illness;
	    }
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getIllness() {
	        return illness;
	    }
	    public static void main(String[] args) {

	        Patient p = new Patient();   

	        p.setId(1);
	        p.setName("Prince");
	        p.setIllness("Fever");

	        System.out.println(p.getId());
	        System.out.println(p.getName());
	        System.out.println(p.getIllness());
	    }
	
	    }
	
	
		

	


