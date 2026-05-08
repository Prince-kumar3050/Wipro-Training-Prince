package Day5;
	import java.util.Scanner;
	class BankAccount {
	    private int accountNumber;
	    private String name;
	    private double balance;

	    void BankAccount(int accountNumber, String name, double balance) {
	        this.accountNumber = accountNumber;
	        this.name = name;
	        this.balance = balance;
	    }

	    void display() {
	        System.out.println("\n--- Account Details ---");
	        System.out.println("Name: " + name);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: ₹" + balance);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Account Number: ");
	        int accNo = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Balance: ");
	        double bal = sc.nextDouble();
	     BankAccount acc = new BankAccount();

	     acc.display();

	        sc.close();
	    }
	}