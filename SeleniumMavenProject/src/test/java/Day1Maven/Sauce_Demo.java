package Day1Maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce_Demo {

	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.saucedemo.com/");

	        driver.manage().window().maximize();

	        Thread.sleep(2000);

	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");

	        driver.findElement(By.id("login-button"))
	              .click();

	        Thread.sleep(3000);

	        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
	              .click();

	        Thread.sleep(2000);

	       
	        driver.findElement(By.className("shopping_cart_link"))
	              .click();

	        Thread.sleep(2000);

	      
	        driver.findElement(By.id("checkout"))
	              .click();

	        Thread.sleep(2000);

	       
	        driver.findElement(By.id("first-name"))
	              .sendKeys("Prince");

	        driver.findElement(By.id("last-name"))
	              .sendKeys("Kumar");

	        driver.findElement(By.id("postal-code"))
	              .sendKeys("845401");

	        Thread.sleep(2000);

	       
	        driver.findElement(By.id("continue"))
	              .click();

	        Thread.sleep(2000);

	        
	        driver.findElement(By.id("finish"))
	              .click();

	        Thread.sleep(3000);

	        System.out.println("Product ordered successfully");

	       
	    }
	}


