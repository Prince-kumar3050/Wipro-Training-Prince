package Day10_P3;
import java.util.*;
	class Patient {
	    int id;
	    String name;

	    Patient(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public String toString() {
	        return "ID: " + id + ", Name: " + name;
	    }
	}
	public class Hospital_Patient_Record {
	    public static void main(String[] args) {

	        TreeMap<Integer, Patient> map = new TreeMap<>();

	        addPatient(map, new Patient(101, "Prince"));
	        addPatient(map, new Patient(102, "Gautam"));
	        addPatient(map, new Patient(103, "Aryan"));
	        addPatient(map, new Patient(101, "Rohit"));

	        map.put(102, new Patient(102, "Updated Gautam"));

	        System.out.println("\nPatient 102: " + map.get(102));

	        map.remove(101);
	        
	        System.out.println("\nAll Patients:");
	        for (Patient p : map.values()) {
	            System.out.println(p);
	        }

	        System.out.println("\nExists ID 103: " + map.containsKey(103));

	        System.out.println("Total Patients: " + map.size());

	        map.clear();
	        System.out.println("System cleared");
	    }

	    public static void addPatient(TreeMap<Integer, Patient> map, Patient p) {
	        if (map.containsKey(p.id)) {
	            System.out.println(" Already exists (ID: " + p.id + ")");
	        } else {
	            map.put(p.id, p);
	            System.out.println("Added: " + p.id);
	        }
	    }
	}


