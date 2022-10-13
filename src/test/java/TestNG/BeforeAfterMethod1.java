package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod1 {


	@Test
	public void payment() {
    	  System.out.println("payment while booking ticket");
    	  
      }
      
    @Test
	public void ticket() {          
    	  System.out.println("Select ticket for booking ");
    	  
      }
      
    @BeforeMethod
    public void login() {
    	 System.out.println("login to IRCTC"); 
    	  
      }
      
      
    @AfterMethod
    public void logout() {
    	  System.out.println("logout from system");
    	  
      }
    
//in one class == @BeforeMethod  ,@Test1 ,@Aftermethod , @BeforeMethod ,@Test2,@AfterMethod 
//mnje before ani after pratek test chya samor mage separately yetil
//ani don class astil tr te separately apl apl run krel mix nahi honar @BeforeTest and 
//@AfterTest sarkh


















}
