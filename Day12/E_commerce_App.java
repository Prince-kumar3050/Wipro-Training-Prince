package Day12;
import java.io.*;
import java.util.Scanner;

public class E_commerce_App {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Order ID: ");
	        int orderId = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Product Name: ");
	        String product = sc.nextLine();

	        System.out.print("Enter Price: ");
	        double price = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Enter Customer Name: ");
	        String customer = sc.nextLine();

	        System.out.print("Enter Shipping Address: ");
	        String address = sc.nextLine();

	        try {

	            PrintWriter pw =
	                    new PrintWriter(
	                            new FileWriter("orders.txt"));

	            pw.println("Order ID: " + orderId);
	            pw.println("Product: " + product);
	            pw.println("Price: " + price);
	            pw.println("Customer: " + customer);
	            pw.println("Shipping Address: " + address);

	            pw.close();

	            System.out.println("\nOrder details saved.");

	        } catch (IOException e) {
	            System.out.println(e);
	        }

	        try {

	            BufferedReader br =
	                    new BufferedReader(
	                            new FileReader("Orders.txt"));

	            String line;

	            System.out.println("\nInvoice Details:");

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
