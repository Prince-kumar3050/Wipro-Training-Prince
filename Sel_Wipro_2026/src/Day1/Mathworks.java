package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mathworks {
	

	    public static void main(String[] args) throws Exception {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://login.mathworks.com");
	        driver.manage().window().maximize();

	        Thread.sleep(3000);

	     
	        driver.findElement(By.id("email"))
	              .sendKeys("prince20020216@gmail.com");

	        Thread.sleep(2000);

	     
	        driver.findElement(
	        By.xpath("//button[contains(text(),'Next')]"))
	              .click();

	        Thread.sleep(3000);

	        
	        driver.findElement(By.id("password"))
	              .sendKeys("Raj@3050");

	        Thread.sleep(2000);

	        
	        driver.findElement(
	        By.xpath("//button[contains(text(),'Sign In')]"))
	              .click();

	        Thread.sleep(5000);

	        System.out.println("Login Successful");

	       
	    }
	}


