package Day12;
import java.io.*;
import java.util.Scanner;
public class Bank_Application {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Account Number: ");
	        int accNo = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Balance: ");
	        double balance = sc.nextDouble();

	        System.out.print("Enter Deposit Amount: ");
	        double deposit = sc.nextDouble();

	        try {

	            FileWriter fw = new FileWriter("Bank.txt");
	            BufferedWriter bw = new BufferedWriter(fw);

	            bw.write("Account Number: " + accNo);
	            bw.newLine();

	            bw.write("Customer Name: " + name);
	            bw.newLine();

	            bw.write("Balance: " + balance);
	            bw.newLine();

	            bw.write("Transaction: Deposited " + deposit);
	            bw.newLine();

	            bw.close();

	            System.out.println("\nBank details saved successfully.");

	        } catch (IOException e) {
	            System.out.println(e);
	        }
	        try {

	            FileReader fr = new FileReader("Bank.txt");
	            BufferedReader br = new BufferedReader(fr);

	            String line;

	            System.out.println("\nReading Bank Details:");

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