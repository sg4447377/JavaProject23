package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest2 {


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

//in one class  @BeforeTest,@Test,@Tes, @AfterTest 
//in two class  @BeforeTest of all classes,@Test of all classes ,@AfterTest of all classes 

//
