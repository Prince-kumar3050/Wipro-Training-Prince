package Day2;
import java.util.Scanner;
public class Password_Retry {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String correctPassword = "Prince";
	        int attempts = 3;

	        while (attempts > 0) {
	            System.out.print("Enter password: ");
	            String input = sc.next();
	            
	            if (input.equals(correctPassword)) {
	                System.out.println("Access Granted");
	                return;
	            } else {
	                attempts--;
	                System.out.println("Wrong Password. Attempts left: " + attempts);
	            }
	        }

	        System.out.println("Account Locked");
	    }
	    
	}


