package Day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sauce_demo {
	
	 public static void main(String[] args)
	            throws InterruptedException {
	       

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        

	        driver.get("https://www.saucedemo.com/");
	       

	        driver.findElement(By.id("user-name"))
	                .sendKeys("standard_user");

	        driver.findElement(By.id("password"))
	                .sendKeys("secret_sauce");

	        driver.findElement(By.id("login-button"))
	                .click();
	        

	        WebDriverWait wait =
	                new WebDriverWait(
	                        driver,
	                        Duration.ofSeconds(10));
	        

	        WebElement addtocart =
	                wait.until(
	                ExpectedConditions
	                .elementToBeClickable(
	                By.id("add-to-cart-sauce-labs-backpack")));

	        addtocart.click();

	        System.out.println(
	                "Product Added Successfully");
	        

	        WebElement cart =
	                wait.until(
	                ExpectedConditions
	                .elementToBeClickable(
	                By.className("shopping_cart_link")));

	        cart.click();

	       System.out.println(
	                "Cart Opened");


	        WebElement checkout =
	                wait.until(
	                ExpectedConditions
	                .elementToBeClickable(
	                By.id("checkout")));

	        checkout.click();   

	        driver.findElement(
	                By.id("first-name"))
	                .sendKeys("Prince");

	        driver.findElement(
	                By.id("last-name"))
	                .sendKeys("Kumar");

	        driver.findElement(
	                By.id("postal-code"))
	                .sendKeys("800001");


	        WebElement continueBtn =
	                wait.until(
	                ExpectedConditions
	                .elementToBeClickable(
	                By.id("continue")));

	        continueBtn.click();


	        WebElement finish =
	                wait.until(
	                ExpectedConditions
	                .elementToBeClickable(
	                By.id("finish")));

	        finish.click();

	        System.out.println(
	                "Order Completed Successfully");

	        Thread.sleep(3000);

	        driver.quit();
	    }
	}
	