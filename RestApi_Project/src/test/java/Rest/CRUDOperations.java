package Rest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.restassured.http.ContentType;
public class CRUDOperations {
	
	
	    ExtentReports extent;
	    ExtentTest test;

	    @BeforeTest
	    public void setup()
	    {
	        extent = ExtentManager.getReportObject();
	    }

	    // ==========================
	    // GET REQUEST
	    // ==========================

	    @Test(priority = 1)
	    public void getUser()
	    {
	        test = extent.createTest("GET User Test");

	        given()

	        .when()
	            .get("https://dummyjson.com/users/1")

	        .then()
	            .statusCode(200)
	            .log().all();

	        test.pass("GET Request Executed Successfully");
	    }

	    // ==========================
	    // POST REQUEST
	    // ==========================

	    @Test(priority = 2)
	    public void createUser()
	    {
	        test = extent.createTest("POST User Test");

	        String requestBody = "{\n" +
	                "  \"firstName\": \"Prince\",\n" +
	                "  \"lastName\": \"Kumar\",\n" +
	                "  \"age\": 22\n" +
	                "}";

	        given()
	            .contentType(ContentType.JSON)
	            .body(requestBody)

	        .when()
	            .post("https://dummyjson.com/users/add")

	        .then()
	            .statusCode(201)
	            .log().all();

	        test.pass("POST Request Executed Successfully");
	    }

	    // ==========================
	    // PUT REQUEST
	    // ==========================

	    @Test(priority = 3)
	    public void updateUser()
	    {
	        test = extent.createTest("PUT User Test");

	        String requestBody = "{\n" +
	                "  \"firstName\": \"UpdatedPrince\",\n" +
	                "  \"age\": 25\n" +
	                "}";

	        given()
	            .contentType(ContentType.JSON)
	            .body(requestBody)

	        .when()
	            .put("https://dummyjson.com/users/1")

	        .then()
	            .statusCode(200)
	            .log().all();

	        test.pass("PUT Request Executed Successfully");
	    }

	    // ==========================
	    // DELETE REQUEST
	    // ==========================

	    @Test(priority = 4)
	    public void deleteUser()
	    {
	        test = extent.createTest("DELETE User Test");

	        given()

	        .when()
	            .delete("https://dummyjson.com/users/1")

	        .then()
	            .statusCode(200)
	            .log().all();

	        test.pass("DELETE Request Executed Successfully");
	    }

	    @AfterTest
	    public void tearDown()
	    {
	        extent.flush();
	    }
	}


