package RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Get_Request01 {
   
  @Test
   public void GetSingleUser() {
	   
	   
   given().baseUri("https://reqres.in/").
   when().get("/api/users/2").
   then().statusCode(200).log().body();
  
  
  
   }
   

}
