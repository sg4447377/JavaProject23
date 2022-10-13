package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoBeforeAftermethod {       

     
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
    
}
class aest1 {
	
	@Test
	public void method1() {
		System.out.println("I am method1");
	}
	
	@BeforeMethod
	public void method2() {
		System.out.println("I am method2");
		
	}
	
	@Test
	public void method3() {
		System.out.println("I am method3");
	}
	
	
	
}


//framework is a structure which helps use to organise test cases
//TestNG = next generation java testing 
//priviously junit farmework is used in market 
//now we used TestNG framework instead of junit 
// framework is helps us to run repeated automated test cases one after another 
//junit has challenges reagardng the repoting 
//so thats why TestNG come into picture 
//TestNg is important one when we actually developing the framework from scratch level
//it provides full control over test cases and executiom of test cases 
//and thats why it called as testing framework 
//TestNg is open source 
//TestNG provides more powerful and flexible test cases with help of easy annotation,grouping,
//,sequencing and parametrizing 
//Advantages of TestNG = 
//1)in TestNg ,annotation are easier to understand than junit
//2) it produces the HTML reports for implimentation
//3) it also generate the logs 
//4) in testng threr is no constraints available such as @beforeclass and @afterclass which is present in junit 
//5) it enables us to group the test cases easily
//6)it support the three additional level such as @ Befoe/After suite ,@Before/After Test, before/After group 
//it does not extends any class ,
//parallel execution of test cases .i.e. multiple test cases is only possible in testNg 
//it allows you to run  the test cases of perticular group (smoke and regression main se sirf regression ko run kr skte hai ) 

//Beforeclass = agar koi class run krna hai but use pehele chahte hai koi aur class run ho tab hum ye use krte hai
//TestNg supoort java 8 and above  version only
//hum maven ke sath kam kre honge toh sirf dependency dalo 
//aur normal java main kre honge toh jar file download krke manually add krna [dega  library  main 
//testing.xml = test cases and classes run krne ke liye hai 
//normal java main testng dalte hai toh run aur debug option t@test ke niche nahi ayega maven ve kam kre toh aayega 







