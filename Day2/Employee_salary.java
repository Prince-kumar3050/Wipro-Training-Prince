package Day2;
import java.util.Scanner;
public class Employee_salary {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of employees: ");
	        int n = sc.nextInt();

	        double[] salary = new double[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter salary of employee " + (i + 1) + ": ");
	            salary[i] = sc.nextDouble();
	        }

	        System.out.print("Enter increment percentage: ");
	        double inc = sc.nextDouble();

	        for (int i = 0; i < n; i++) {
	            salary[i] += (salary[i] * inc / 100);
	            System.out.println("Updated Salary of Employee " + (i + 1) + ": " + salary[i]);
	        }
	        
	    }
	}

