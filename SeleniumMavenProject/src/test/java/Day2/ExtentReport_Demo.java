package Day2;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport_Demo {
	

	    public static void main(String[] args) throws Exception {

	        
	        ExtentSparkReporter reporter =
	                new ExtentSparkReporter("reports/ExtentReport.html");

	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(reporter);

	        ExtentTest test =
	                extent.createTest("SauceDemo Login Test");

	        WebDriver driver = new ChromeDriver();

	        test.info("Browser Launched");

	        driver.manage().window().maximize();

	        driver.get("https://www.saucedemo.com");

	        test.info("Opened SauceDemo Website");

	        driver.findElement(By.id("user-name"))
	                .sendKeys("standard_user");

	        test.pass("Username Entered");

	        driver.findElement(By.id("password"))
	                .sendKeys("secret_sauce");

	        test.pass("Password Entered");

	        driver.findElement(By.id("login-button"))
	                .click();

	        test.pass("Login Button Clicked");

	        String title = driver.getTitle();

	        
	        File folder = new File("screenshots");
	        folder.mkdirs();

	        if(title.contains("Swag Labs"))
	        {
	            test.pass("Login Successful");

	            File src=((TakesScreenshot)driver)
	                    .getScreenshotAs(OutputType.FILE);

	            File dest=new File("screenshots/pass.png");

	            FileHandler.copy(src,dest);

	            test.addScreenCaptureFromPath("screenshots/pass.png");
	        }

	        else
	        {
	            test.fail("Login Failed");

	            File src=((TakesScreenshot)driver)
	                    .getScreenshotAs(OutputType.FILE);

	            File dest=new File("screenshots/fail.png");

	            FileHandler.copy(src,dest);

	            test.addScreenCaptureFromPath("screenshots/fail.png");
	        }

	        driver.quit();

	        test.info("Browser Closed");

	        extent.flush();

	        System.out.println("Extent Report Generated");
	    }
	}