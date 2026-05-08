package Day9;
import java.util.LinkedList;
import java.util.Scanner;

public class Hospital_Queue {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        LinkedList<String> queue = new LinkedList<>();

	        int choice;

	        do {
	            System.out.println("\n--- Hospital Queue System ---");
	            System.out.println("1. Add Patient (Normal)");
	            System.out.println("2. Add Patient (Emergency - Beginning)");
	            System.out.println("3. Remove Patient");
	            System.out.println("4. View All Patients");
	            System.out.println("5. Check First Patient");
	            System.out.println("6. Check Last Patient");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); 

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter patient name: ");
	                    String name = sc.nextLine();
	                    queue.addLast(name); 
	                    System.out.println("Patient added.");
	                    break;

	                case 2:
	                    System.out.print("Enter emergency patient name: ");
	                    String emergency = sc.nextLine();
	                    queue.addFirst(emergency); 
	                    System.out.println("Emergency patient added at beginning.");
	                    break;

	                case 3:
	                    if (!queue.isEmpty()) {
	                        String removed = queue.removeFirst();
	                        System.out.println("Removed patient: " + removed);
	                    } else {
	                        System.out.println("Queue is empty.");
	                    }
	                    break;

	                case 4:
	                    if (queue.isEmpty()) {
	                        System.out.println("No patients in queue.");
	                    } else {
	                        System.out.println("Patient List:");
	                        for (String p : queue) {
	                            System.out.println(p);
	                        }
	                    }
	                    break;

	                case 5:
	                    if (!queue.isEmpty()) {
	                        System.out.println("First patient: " + queue.getFirst());
	                    } else {
	                        System.out.println("Queue is empty.");
	                    }
	                    break;

	                case 6:
	                    if (!queue.isEmpty()) {
	                        System.out.println("Last patient: " + queue.getLast());
	                    } else {
	                        System.out.println("Queue is empty.");
	                    }
	                    break;

	                case 0:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }

	        } while (choice != 0);

	        sc.close();
	    }
	}
	


