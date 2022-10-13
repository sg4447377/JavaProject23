package RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Get_Request {

   @Test
   public void get() {
	  //given()-pass information - url,header
	  //when()- give api method and endpoints 
	  //then() - expect response,log, assertion/validations
	   
	  given().        //pass basic url
	  baseUri("https://reqres.in/"). 
	   
	  when().         //pass http method and end points 
      get("/api/users?page=2").
   
      then().          //for response 
      statusCode(200).  
      log().all();     //to print response  
   
   
   
   }


 }

//JSON (Java Script Object Notations) is a text format for storing and transporting data 
//syntax start from {"name":"john" , "age":30, "car":null} key-value pair main hota hai 
//XML = eXtensible Markup Language = design to store and transport the data 
//syntax = <note>
//              <to>tove</to>
//         <note>
//xml is just imformation wrapped in tags 
//JSoN and XML are data formatter 
//client and server = client menas user ; server means application which we used 
//internet ko interview main http protocol bolna hai 
//main url aage jo bhi rahega wo endpoints rahega ==endpoints is a location where an api receive request about a specific resources on its server 









