package Day1Maven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Google {
	
		
		    public static void main(String[] args) throws InterruptedException {

		        WebDriver driver = new ChromeDriver();

		        driver.get("https://www.google.com");
		        
	            Thread.sleep(4000);
	            
		        System.out.println(driver.getTitle());

		       // driver.quit();//
		    }
		}



