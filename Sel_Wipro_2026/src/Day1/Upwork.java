package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Upwork {
	

	    public static void main(String[] args) throws Exception {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.upwork.com/ab/account-security/login");
	        driver.manage().window().maximize();

	        Thread.sleep(3000);

	      
	        driver.findElement(By.id("login_username"))
	              .sendKeys("prince346ranj@gmail.com");

	        Thread.sleep(2000);

	        
	        driver.findElement(
	        By.xpath("//button[contains(text(),'Continue')]"))
	              .click();

	        Thread.sleep(3000);

	       
	        driver.findElement(By.id("login_password"))
	              .sendKeys("Prince@3050");

	        Thread.sleep(2000);

	        
	        driver.findElement(By.id("login_control_continue"))
	              .click();

	        Thread.sleep(5000);

	        System.out.println("Login Successful");

	        driver.quit();
	    }
	}


