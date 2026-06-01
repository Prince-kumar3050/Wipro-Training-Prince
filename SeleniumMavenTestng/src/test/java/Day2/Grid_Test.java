package Day2;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Grid_Test {
	
	 WebDriver driver;

	    @SuppressWarnings("deprecation")
		@Parameters("browser")
	    @Test
	    public void launchBrowser(String browser) throws Exception {

	        if(browser.equalsIgnoreCase("chrome")) {

	            driver = new RemoteWebDriver(
	                    new URL("http://localhost:4444"),
	                    new ChromeOptions());
	        }

	        else if(browser.equalsIgnoreCase("edge")) {

	            driver = new RemoteWebDriver(
	                    new URL("http://localhost:4444"),
	                    new EdgeOptions());
	        }

	        driver.manage().window().maximize();

	        driver.get("https://www.saucedemo.com");

	        
	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");

	        driver.findElement(By.id("login-button"))
	              .click();

	        System.out.println("Browser : " + browser);

	        System.out.println("Title : "
	                + driver.getTitle());

	        System.out.println("Thread ID : "
	                + Thread.currentThread().getId());
               Thread.sleep(20000);
	        driver.quit();
	    }
	}