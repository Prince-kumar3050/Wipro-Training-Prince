package SelTestng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Para_Bank {
	
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
	    public void verifyTitle() throws InterruptedException
	    {
	        String actualTitle=driver.getTitle();

	        Assert.assertEquals(actualTitle,
	                "ParaBank | Welcome | Online Banking");

	        System.out.println("Title Validation Passed");

	        Thread.sleep(2000);
	    }

	    @Test(priority=2)
	    public void loginTest() throws InterruptedException
	    {
	        driver.findElement(By.name("username"))
	              .sendKeys("Prince Kumar");

	        Thread.sleep(2000);

	        driver.findElement(By.name("password"))
	              .sendKeys("Prince@123");

	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@value='Log In']"))
	              .click();

	        Thread.sleep(3000);

	        String currentURL=driver.getCurrentUrl();

	        Assert.assertTrue(currentURL.contains("overview"));

	        System.out.println("Login Passed");
	    }

	    @Test(priority=3)
	    public void transferFundTest() throws InterruptedException
	    {
	        driver.findElement(By.name("username"))
	              .sendKeys("Prince Kumar");

	        Thread.sleep(2000);

	        driver.findElement(By.name("password"))
	              .sendKeys("Prince@123");

	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@value='Log In']"))
	              .click();

	        Thread.sleep(3000);

	        driver.findElement(
	              By.linkText("Transfer Funds"))
	              .click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("amount"))
	              .sendKeys("500");

	        Thread.sleep(2000);

	        driver.findElement(
	              By.xpath("//input[@value='Transfer']"))
	              .click();

	        Thread.sleep(3000);

	       // String msg=driver.findElement(
	             // By.className("title"))
	              //.getText();

	       // Assert.assertEquals(msg,
	         //       "Transfer Complete!");
	        String transferMessage = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/h1")).getText();

	        Assert.assertEquals(transferMessage, "Transfer Complete!");

	        System.out.println("Fund Transfer Passed");
	    }

	    @AfterMethod
	    public void tearDown() throws InterruptedException
	    {
	        Thread.sleep(3000);

	        driver.quit();
	    }
	}


