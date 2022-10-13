package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.login_Actitime03page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_Actitime03 {

	 public static WebDriver driver;
	
	 public  login_Actitime03page lp;   //create global reference varible of page object class 
		
	   @Given("open browser and navigate to url {String}")
		public void openbrowser(String url) {
	       	
	    	WebDriverManager.chromedriver().setup();
			 
			 driver = new   ChromeDriver();
			 
			 lp = new login_Actitime03page(driver);    //here we calling constructor of page object class file  
			 //yaha pe jo parameter pass kiya hai driver krke wo page object class ke ldriver se connect krega 
			 
			 
			 
			 driver.get(url);   //yaha pe url feature file se ayyega 
			 
			 driver.manage().window().maximize();
			 
	    	
	    }
	    
	    @When("enter valid username as {String} and password as {String}")
	    public void credentials(String username,String password) {
	      //yaha ke locators page object file main 
	    	
	    	lp.setUsername(username);   //calling username method from page object model  for interaction with this file 
	    	lp.setPassword(password);    //calling password method from page object model for intercation with this file
	    	
	    }			
	    
	    @Then("click on login button actitime03")
	    public void validatelogin() {
	    	
		   //yaha ke locators page object file main 
           lp.clickLogin();  //calling login mrthod from page object class for intercation
	    	
	    }


 }

//page factory == 
//page factory is predefined class hi hai usme method bhi hai 
//it is used for initialisation os page object  or to instantiate the page object 
//it is also used to initialise page class elements without using "FindElements"
//with the help of of class page factory in selenium ,we use annotations @FindBy to find WebElelments, we use initElements method to initialise web elements .
//
