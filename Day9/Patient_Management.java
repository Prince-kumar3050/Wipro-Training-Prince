package Day9;
import java.util.*;

public class Patient_Management {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<String> patients = new ArrayList<>();

	        int choice;

	        do {
	            System.out.println("\n--- Patient Management System ---");
	            System.out.println("1. Add Patient");
	            System.out.println("2. View All Patients");
	            System.out.println("3. Search Patient");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter patient name: ");
	                    String name = sc.nextLine();
	                    patients.add(name);
	                    System.out.println("Patient added!");
	                    break;

	                case 2:
	                    if (patients.isEmpty()) {
	                        System.out.println("No patients found.");
	                    } else {
	                        System.out.println("Patient List:");
	                        for (String p : patients) {
	                            System.out.println(p);
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter name to search: ");
	                    String search = sc.nextLine();

	                    if (patients.contains(search)) {
	                        System.out.println("Patient found: " + search);
	                    } else {
	                        System.out.println("Patient not found.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}


