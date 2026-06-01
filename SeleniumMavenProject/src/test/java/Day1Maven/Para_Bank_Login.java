package Day1Maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
public class Para_Bank_Login {


	    public static void main(String[] args) throws InterruptedException {

	        
	        WebDriver driver = new ChromeDriver();

	       
	        driver.get("https://parabank.parasoft.com/parabank/index.htm");

	      
	        driver.manage().window().maximize();

	        Thread.sleep(2000);

	        
	        driver.findElement(By.name("username"))
	              .sendKeys("Prince Raj");

	        driver.findElement(By.name("password"))
	              .sendKeys("Prince@123");

	        driver.findElement(By.xpath("//input[@value='Log In']"))
	              .click();

	        Thread.sleep(3000);

	        
	        driver.findElement(By.linkText("transfre.html"))
	              .click();

	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("amount"))
	        .sendKeys("5000");

	  Thread.sleep(2000);
    
	        driver.findElement(
	                By.xpath("//input[@value='Transfer']"))
	              .click();

	        Thread.sleep(3000);

	       
	        String message = driver.findElement(
	                By.className("title"))
	                .getText();

	        System.out.println(message);

	        Thread.sleep(3000);

	        
	        driver.findElement(By.linkText("Log Out"))
	              .click();

	        Thread.sleep(3000);

	        
	    }
	}    	    	  