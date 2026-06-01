package Day25_Assignment;
import org.testng.annotations.Test;
public class SmokeRegressionTest {

	    @Test(groups = {"smoke"})
	    public void loginTest() {

	        System.out.println("Smoke Login Test Executed");
	    }

	    @Test(groups = {"smoke"})
	    public void addToCartTest() {

	        System.out.println("Smoke Add To Cart Test Executed");
	    }

	    @Test(groups = {"regression"})
	    public void checkoutTest() {

	        System.out.println("Regression Checkout Test Executed");
	    }
	}

