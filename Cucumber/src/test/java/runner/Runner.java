package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	

	@CucumberOptions(

	features = "src/test/resources/Login.feature",

	glue = {
	"stepdefinition",
	"hooks"
	},

	plugin = {

	"pretty",

	"html:target/cucumber-report.html"

	},

	monochrome = true
	)
	public class Runner  extends AbstractTestNGCucumberTests {
	//public class TestRunner extends AbstractTestNGCucumberTests {

	}


