package Day1;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Amazon_Test {

	    public static void main(String[] args) throws Exception {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.amazon.in"); 
	        driver.manage().window().maximize();

	        Thread.sleep(4000);
	        
	        driver.findElement(By.id("nav-link-accountList")).click();

	        Thread.sleep(3000);
	        driver.findElement(By.id("ap_email_login"))
	              .sendKeys("9771566760");

	        driver.findElement(By.id("continue")).click();

	        Thread.sleep(3000);
	        driver.findElement(By.id("ap_password"))
	              .sendKeys("Prince@3050");

	    
	        driver.findElement(By.id("signInSubmit")).click();

	        
	        driver.findElement(By.id("twotabsearchtextbox"))
	              .sendKeys("Charger");

	        driver.findElement(By.id("nav-search-submit-button"))
	              .click();

	        Thread.sleep(3000);
	        
	        driver.findElement(By.cssSelector(
	        		"a.a-link-normal.s-no-outline"))
	        		.click();

	        		Thread.sleep(3000);

	        		

	        		JavascriptExecutor js = (JavascriptExecutor) driver;

	        		js.executeScript(
	        		"arguments[0].click();",
	        		driver.findElement(
	        		By.xpath("//button[contains(@aria-label,'Add to cart')]"))
	        		);
	        		Thread.sleep(3000);

	        	
	        System.out.println("Product searched successfully");

	       // driver.quit();
	    }
	}