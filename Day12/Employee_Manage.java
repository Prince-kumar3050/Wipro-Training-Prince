package Day12;
import java.io.*;
import java.util.Scanner;
	class Employee implements Serializable {

	    int id;
	    String name;
	    double salary;

	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    void display() {

	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Salary: " + salary);
	    }
	}
	public class Employee_Manage {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();

	        try {

	            Employee emp =
	                    new Employee(id, name, salary);

	            ObjectOutputStream oos =
	                    new ObjectOutputStream(
	                            new FileOutputStream("employee.txt"));

	            oos.writeObject(emp);

	            oos.close();

	            System.out.println("\nEmployee object saved.");

	        } catch (IOException e) {
	            System.out.println(e);
	        }

	        try {

	            ObjectInputStream ois =
	                    new ObjectInputStream(
	                            new FileInputStream("employee.txt"));

	            Employee emp2 =
	                    (Employee) ois.readObject();

	            System.out.println("\nEmployee Details:");
	            emp2.display();

	            ois.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }

	        sc.close();
	    }
	}


