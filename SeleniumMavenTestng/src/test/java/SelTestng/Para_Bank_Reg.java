package SelTestng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class Para_Bank_Reg {
	
	
	
	    WebDriver driver;

	    @BeforeMethod
	    public void setup() throws InterruptedException
	    {
	        driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://parabank.parasoft.com/parabank");

	        Thread.sleep(3000);
	    }

	    @Test(priority=1)
	    public void registerUser() throws InterruptedException
	    {
	        driver.findElement(By.linkText("Register"))
	              .click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("customer.firstName"))
	              .sendKeys("Prince");

	        driver.findElement(By.id("customer.lastName"))
	              .sendKeys("Kumar");

	        driver.findElement(By.id("customer.address.street"))
	              .sendKeys("Patna");

	        driver.findElement(By.id("customer.address.city"))
	              .sendKeys("Patna");

	        driver.findElement(By.id("customer.address.state"))
	              .sendKeys("Bihar");

	        driver.findElement(By.id("customer.address.zipCode"))
	              .sendKeys("800001");

	        driver.findElement(By.id("customer.phoneNumber"))
	              .sendKeys("9876543890");

	        driver.findElement(By.id("customer.ssn"))
	              .sendKeys("123456");

	        driver.findElement(By.id("customer.username"))
	              .sendKeys("Prince Kumar");

	        driver.findElement(By.id("customer.password"))
	              .sendKeys("Prince@123");

	        driver.findElement(By.id("repeatedPassword"))
	              .sendKeys("Prince@123");

	        Thread.sleep(2000);

	        driver.findElement(
	                By.xpath("//input[@value='Register']"))
	                .click();

	        Thread.sleep(3000);

	        String msg = driver.findElement(
	                By.className("title"))
	                .getText();

	        Assert.assertEquals(msg,
	                "Welcome Prince Kumar");

	        System.out.println("Registration Passed");
	    }

	    @AfterMethod
	    public void tearDown() throws InterruptedException
	    {
	        Thread.sleep(3000);

	        driver.quit();
	    }
	}