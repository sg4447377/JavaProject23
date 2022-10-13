package TestNG;

import org.testng.annotations.Test;

public class DemoTestParameters {

   @Test(enabled = false,priority=1,description= "temporary disabled")    //i.e. enabled = false = disable so wo method run nahi hoga  
   public void method1() {
	  System.out.println("Method 1"); 
	   
   }
   
   @Test(priority=2,description = "method is enabled")
   public void method2() {
	  System.out.println("Method 2"); 
	   
   }
   
   @Test(dependsOnMethods = "method2",priority=3 )
   public void method3() {
	  System.out.println("method 3"); 
	   
   }

}



//dependsOnMethods = "method2" menas that method3 is depends on method2 ....i.e. if method2 is run then method3 is run  
//dependsOnMethods = "method1" aaise krte hai toh exception dega kyuki humne method1 ko disabled krke rakha hai
//parameters mostly used = enabled , disabled. priority,discription ,alwaysrun ,groups 
//more  than one parameters can be used by using comma,
