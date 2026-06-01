package SelTestng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class Sauce_demo {

	    WebDriver driver;

	    @BeforeMethod
	    public void setup() throws InterruptedException
	    {
	        driver = new ChromeDriver();

	        driver.manage().window().maximize();

	       // Thread.sleep(2000);

	        driver.get("https://www.saucedemo.com");

	        Thread.sleep(3000);
	    }

	    @Test(priority=1)
	    public void verifyLoginPageTitle() throws InterruptedException
	    {
	        Thread.sleep(2000);

	        String actualTitle = driver.getTitle();

	        Assert.assertEquals(actualTitle,"Swag Labs");

	        System.out.println("Title Validation Passed");

	        Thread.sleep(2000);
	    }

	    @Test(priority=2)
	    public void loginTest() throws InterruptedException
	    {
	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        Thread.sleep(2000);

	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");

	        Thread.sleep(2000);

	        driver.findElement(By.id("login-button"))
	              .click();

	        Thread.sleep(3000);

	        String currentURL = driver.getCurrentUrl();

	        Assert.assertTrue(
	                currentURL.contains("inventory"));

	        System.out.println("Login Test Passed");

	        Thread.sleep(2000);
	    }

	    @Test(priority=3)
	    public void verifyProductPage() throws InterruptedException
	    {
	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        Thread.sleep(2000);

	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");

	        Thread.sleep(2000);

	        driver.findElement(By.id("login-button"))
	              .click();

	        Thread.sleep(3000);

	        String productText =
	                driver.findElement(
	                By.className("title"))
	                .getText();

	        Assert.assertEquals(
	                productText,"Products");

	        System.out.println(
	                "Product Page Validation Passed");

	        Thread.sleep(2000);
	    }
	    
	    @Test(priority=4)
	    public void addToCartTest() throws InterruptedException
	    {
	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        Thread.sleep(2000);

	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");

	        Thread.sleep(2000);

	        driver.findElement(By.id("login-button"))
	              .click();

	        Thread.sleep(3000);

	        driver.findElement(
	                By.id("add-to-cart-sauce-labs-backpack"))
	                .click();

	        Thread.sleep(3000);

	        String cartCount=
	                driver.findElement(
	                By.className("shopping_cart_badge"))
	                .getText();

	        Assert.assertEquals(cartCount,"1");

	        System.out.println("Add To Cart Passed");

	        Thread.sleep(2000);
	    }


	    @Test(priority=5)
	    public void checkoutTest() throws InterruptedException
	    {
	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        Thread.sleep(2000);

	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");

	        Thread.sleep(2000);

	        driver.findElement(By.id("login-button"))
	              .click();

	        Thread.sleep(3000);

	        driver.findElement(
	                By.id("add-to-cart-sauce-labs-backpack"))
	                .click();

	        Thread.sleep(2000);

	        driver.findElement(
	                By.className("shopping_cart_link"))
	                .click();

	        Thread.sleep(2000);

	        driver.findElement(
	                By.id("checkout"))
	                .click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("first-name"))
	              .sendKeys("Prince");

	        Thread.sleep(1000);

	        driver.findElement(By.id("last-name"))
	              .sendKeys("Kumar");

	        Thread.sleep(1000);

	        driver.findElement(By.id("postal-code"))
	              .sendKeys("847452");

	        Thread.sleep(1000);

	        driver.findElement(By.id("continue"))
	              .click();

	        Thread.sleep(2000);

	        driver.findElement(By.id("finish"))
	              .click();

	        Thread.sleep(3000);

	        String orderMsg=
	                driver.findElement(
	                By.className("complete-header"))
	                .getText();

	        Assert.assertEquals(
	                orderMsg,
	                "Thank you for your order!");

	        System.out.println("Checkout Passed");

	        Thread.sleep(2000);
	    }

	    @AfterMethod
	    public void tearDown() throws InterruptedException
	    {
	        Thread.sleep(3000);

	        driver.quit();
	    }
	}


