package Day2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sql_Ddt {
	

	    public static void main(String[] args) throws Exception {

	        
	        Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/wipro_db",
	                "root",
	                "Prince@3050");

	        Statement st = con.createStatement();

	        ResultSet rs = st.executeQuery(
	                "select * from login");

	        while(rs.next())
	        {
	            String username = rs.getString("username");
	            String password = rs.getString("password");

	            WebDriver driver = new ChromeDriver();

	            driver.get("https://www.saucedemo.com/");

	            driver.findElement(By.id("user-name"))
	                  .sendKeys(username);
	            Thread.sleep(3000);

	            driver.findElement(By.id("password"))
	                  .sendKeys(password);
	            Thread.sleep(2000);

	            driver.findElement(By.id("login-button"))
	                  .click();

	            Thread.sleep(2000);

	            driver.quit();
	        }

	        con.close();
	        rs.close();
	        con.close();
	        st.close();
	    }
	}


