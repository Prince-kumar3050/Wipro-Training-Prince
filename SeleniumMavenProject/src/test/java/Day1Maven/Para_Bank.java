package Day1Maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Para_Bank {


	    public static void main(String[] args) throws Exception {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://parabank.parasoft.com/parabank/register.htm");

	        driver.manage().window().maximize();

	        Thread.sleep(3000);

	 
	        driver.findElement(By.id("customer.firstName"))
	              .sendKeys("Prince");

	        
	        driver.findElement(By.id("customer.lastName"))
	              .sendKeys("Kumar");

	        
	        driver.findElement(By.id("customer.address.street"))
	              .sendKeys("Patna");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("customer.address.city"))
	              .sendKeys("Patna");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("customer.address.state"))
	              .sendKeys("Bihar");

	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("customer.address.zipCode"))
	              .sendKeys("800001");

	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("customer.phoneNumber"))
	              .sendKeys("9771566760");

	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("customer.ssn"))
	              .sendKeys("123456");

	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("customer.username"))
	              .sendKeys("Prince Raj");
                   
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("customer.password"))
	              .sendKeys("Prince@123");
                   
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("repeatedPassword"))
	              .sendKeys("Prince@123");

	        Thread.sleep(2000);

	        
	        driver.findElement(
	                By.xpath("//input[@value='Register']"))
	                .click();

	        Thread.sleep(3000);

	        System.out.println("Registration completed");

	        
	    }
	}


