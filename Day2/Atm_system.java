package Day2;

public class Atm_system {
	 public static void main(String[] args) {
	        double balance = 7000;
	        double withdraw = 2000;

	        if (withdraw <= balance) {
	            balance = balance - withdraw;
	            System.out.println("Withdrawal Successful");
	            System.out.println("Remaining Balance: " + balance);
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

}
