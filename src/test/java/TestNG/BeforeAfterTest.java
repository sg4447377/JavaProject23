package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {

	@Test
	public void payment() {
    	  System.out.println("payment while booking ticket");
    	  
      }
      
    @Test 
	public void ticket() {          
    	  System.out.println("Select ticket for booking ");
    	  
      }
      
    @BeforeTest
    public void login() {
    	 System.out.println("login to IRCTC"); 
    	  
      }
      
      
    @AfterTest
    public void logout() {
    	  System.out.println("logout from IRCTC");
    	  
      }
}
class BeforeAfterTest1 {
	
	 @BeforeTest
	  public void login() {
	    	 System.out.println("login to redbus"); 
	    	  
	      }
	 
     @Test 
	 public void ticket() {          
	    	  System.out.println("Select ticket for booking from redbus ");
	    	  
	      }
	      
     @AfterTest
     public void logout() {
     	  System.out.println("logout from redbus");
     	  
       }   
	
	
	
}



//BeforeTest and AfterTest ye test case nahi ...yaha pe sirf donhi test case hai 
//ticket and payment ,eans jaha pe @Test likha hoga vahi test case hai 
//@BeforeTest  @test jitne bhi hoge usepehele run honge and @Test sare run hone ke baad
//@AfterTest  run honge
//ek class main multiple beforeTest reh skte hai 
//@AfterTest bhi reh skte haimultiple ek class main
//if two class hai toh firstly dono class ke @BeforeTest method run hogi and then dono class ki @Test method run hogi 
//and last dono class ki @AfterTest method run hogi 
//Extend report in testNg  == if u r using testng framework testNg has some features of genrarting reports 
//whenever u run any program or enitre suit or different claases after thar areport is getting generate in test-output folder
//that  report is emailable u can send to anyone 
//section in it =  which file is been executed , how many test cases executed
//what are status of it is it pass is fail , and how much time it take for execution 
//all this section are there in extend report 
//




