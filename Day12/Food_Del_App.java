package Day12;
import java.io.*;
import java.util.Scanner;

public class Food_Del_App {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Restaurant Name: ");
	        String restaurant = sc.nextLine();

	        System.out.print("Enter Customer Order: ");
	        String order = sc.nextLine();

	        System.out.print("Enter Delivery Status: ");
	        String status = sc.nextLine();

	        try {

	            BufferedWriter bw =
	                    new BufferedWriter(
	                            new FileWriter("Food.txt"));

	            bw.write("Restaurant: " + restaurant);
	            bw.newLine();
	            

	            bw.write("Customer Order: " + order);
	            bw.newLine();

	            bw.write("Delivery Status: " + status);

	            bw.close();

	            System.out.println("\nFood order saved.");

	        } catch (IOException e) {
	            System.out.println(e);
	        }

	        try {

	            BufferedReader br =
	                    new BufferedReader(
	                            new FileReader("Food.txt"));

	            String line;

	            System.out.println("\nDelivery Details:");

	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	            br.close();

	        } catch (IOException e) {
	            System.out.println(e);
	        }

	        sc.close();
	    }
	}


