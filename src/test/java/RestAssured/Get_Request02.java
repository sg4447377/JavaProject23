package RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Get_Request02 {

  @Test
  public void SingleUserNotFound() {
	  
	  given().baseUri("https://reqres.in/").
	   when().get("/api/users/23").             //endpoint 
	   then().statusCode(200).log().body();
	  
	  
	  
  }


}
