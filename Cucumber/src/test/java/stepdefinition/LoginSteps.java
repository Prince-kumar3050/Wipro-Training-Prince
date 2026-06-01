package stepdefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.cucumber.java.en.*;

public class LoginSteps extends BaseClass {
	
	
	    @Given("user opens login page")
	    public void user_opens_login_page() {

	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }

	    @When("user enters username {string}")
	    public void user_enters_username(String username) {

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

	        driver.findElement(By.name("username")).sendKeys(username);
	    }

	    @And("user enters password {string}")
	    public void user_enters_password(String password) {

	        driver.findElement(By.name("password")).sendKeys(password);
	    }

	    @And("clicks on login button")
	    public void clicks_on_login_button() {

	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	    }

	    @Then("user should navigate to dashboard")
	    public void user_should_navigate_to_dashboard() {

	        System.out.println("Login Successful");
	    }
	}
	  
