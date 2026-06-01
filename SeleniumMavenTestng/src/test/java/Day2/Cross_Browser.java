package Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Cross_Browser {
	 WebDriver driver;

	    @Test
	    @Parameters("browser")
	    public void launchBrowser(String browser)
	    {
	        if(browser.equalsIgnoreCase("chrome"))
	        {
	            driver = new ChromeDriver();
	        }
	       
         
	        else if(browser.equalsIgnoreCase("edge"))
	        {
	            driver = new EdgeDriver();
	        }

	        driver.get("https://www.saucedemo.com");

	      
	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        
	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");

	        
	        driver.findElement(By.id("login-button"))
	              .click();

	        System.out.println("Browser : " + browser);
	        System.out.println("Thread ID:" + Thread.currentThread().getId());
	        System.out.println("Title : " + driver.getTitle());

	        driver.quit();
	    }
	}
	   

