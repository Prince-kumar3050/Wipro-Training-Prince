package Day6;
import java.util.Scanner;

class InvalidPINException extends Exception {
 public InvalidPINException(String message) {
     super(message);
 }
}

public class ATM {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int correctPIN = 9771;
     double balance = 10000; 

     try {
         System.out.println("Insert your ATM card...");
         System.out.print("Enter your PIN: ");
         int enteredPIN = sc.nextInt();

         if (enteredPIN != correctPIN) {
             throw new InvalidPINException("Incorrect PIN!"); 
         }

         System.out.println("PIN Verified Successfully");

         int choice;
         do {
             System.out.println("\n--- ATM MENU ---");
             System.out.println("1. Check Balance");
             System.out.println("2. Deposit");
             System.out.println("3. Withdraw");
             System.out.println("4. Exit");
             System.out.print("Enter your choice: ");
             choice = sc.nextInt();
             
             switch (choice) {
                 case 1:
                     System.out.println("Current Balance: " + balance);
                     break;

                 case 2:
                     System.out.print("Enter amount to deposit: ");
                     double deposit = sc.nextDouble();
                     balance += deposit;
                     System.out.println("Deposit Successful");
                     break;

                 case 3:
                     System.out.print("Enter amount to withdraw: ");
                     double withdraw = sc.nextDouble();

                     if (withdraw > balance) {
                         System.out.println("Insufficient Balance ");
                     } else {
                         balance -= withdraw;
                         System.out.println("Withdrawal Successful");
                     }
                     break;

                 case 4:
                     System.out.println("Thank you! Visit again.");
                     break;

                 default:
                     System.out.println("Invalid choice");
             }

         } while (choice != 4);

     } 
     catch (InvalidPINException e) {
         System.out.println("Error: " + e.getMessage());
         System.out.println("Access Denied ");
     } 
     catch (Exception e) {
         System.out.println("Invalid Input! Please enter correct values.");
     } 
     finally {
         System.out.println("Transaction Logged ");
         sc.close();
     }
 }
}