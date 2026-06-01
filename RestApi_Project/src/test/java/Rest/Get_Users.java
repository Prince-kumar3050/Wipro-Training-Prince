package Rest;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
 
public class Get_Users {
	  @Test
	    public void getUsers() {

	        given()
	        .when()
	        .get("https://dummyjson.com/users")
	        .then()
	        .statusCode(200)
	        .log().all();   

	    }
	}
    