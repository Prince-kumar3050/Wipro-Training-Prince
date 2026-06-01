package Rest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.*;

import io.restassured.http.ContentType;
public class CRUDExcelOperation {
	

	    ExtentReports extent;
	    ExtentTest test;

	    @BeforeTest
	    public void setup() {
	        extent = ExtentManager.getReportObject();
	    }

	    @Test
	    public void CRUDOperation() {

	        test = extent.createTest("CRUD Operations Using Excel Data");

	        // Your Excel Path
	       
	        String path = System.getProperty("user.dir") + "/Book2.xlsx";

	        ExcelUtils excel = new ExcelUtils(path, "Sheet1");

	        int rows = excel.getRowCount();

	        for(int i = 1; i < rows; i++) {

	            String firstName = excel.getCellData(i,0);
	            String lastName = excel.getCellData(i,1);
	            String age = excel.getCellData(i,2);

	            // POST REQUEST
	            String requestBody = "{\n" +
	                    "\"firstName\":\"" + firstName + "\",\n" +
	                    "\"lastName\":\"" + lastName + "\",\n" +
	                    "\"age\":" + age + "\n" +
	                    "}";

	            int userId = given()
	                    .contentType(ContentType.JSON)
	                    .body(requestBody)

	            .when()
	                    .post("https://dummyjson.com/users/add")

	            .then()
	                    .statusCode(201)
	                    .log().all()

	            .extract()
	                    .path("id");

	            test.pass("POST Success : " + firstName);

	            // GET REQUEST
	            given()

	            .when()
	                    .get("https://dummyjson.com/users/1")

	            .then()
	                    .statusCode(200)
	                    .log().all();

	            test.pass("GET Success");

	            // PUT REQUEST
	            String updateBody = "{\n" +
	                    "\"firstName\":\"Updated" + firstName + "\"\n" +
	                    "}";

	            given()
	                    .contentType(ContentType.JSON)
	                    .body(updateBody)

	            .when()
	                    .put("https://dummyjson.com/users/1" )

	            .then()
	                   .statusCode(200)
	                    .log().all();

	            test.pass("PUT Success");

	            // DELETE REQUEST
	            given()

	            .when()
	                    .delete("https://dummyjson.com/users/1" )

	            .then()
	                    .statusCode(200)
	                    .log().all();

	            test.pass("DELETE Success");
	        }
	    }

	    @AfterTest
	    public void tearDown() {
	        extent.flush();
	    }
	}
	

	  	