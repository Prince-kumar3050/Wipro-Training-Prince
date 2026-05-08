package Day3;

public class Bank {
	 private double balance;

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	    public static void main(String[] args) {
	        Bank b = new Bank();

	        b.deposit(1000);
	        b.withdraw(200);

	        System.out.println("Balance: " + b.getBalance());
	    }

}
