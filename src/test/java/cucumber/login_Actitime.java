package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_Actitime {


	 public static WebDriver driver;
		
		@Given("open browser and navigate to url actitime  ")
		public void browser() {
	       	
	    	WebDriverManager.chromedriver().setup();
			 
			 driver = new   ChromeDriver();
			 
			 driver.get("https://demo.actitime.com/login.do");
			 
			 driver.manage().window().maximize();
			 
	    	
	    }
	    
	    @When("enter valid (.*) and (.*) actitime$")
	    public void credentials(String username,String password) {
	       
	    	//username
	    	driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[3]")).sendKeys("username");
	    			
	       //Password
	        driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[2]")).sendKeys("password");
	    			
	    }			
	    
	    @Then(" click on login button actitime ")
	    public void validatelogin() {
	    	
	    	//Login
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			

	    	
	    }
	    
	   
  }


//(.*) means we can put any value over there
//in feature file when we pass parameters then we have used Scenario Outline 
//we use $ because we have take the parameters again and again 
//difference between testNg and cucumber = TestNg is test case driven development  and cucumber is behaviour driven  development 
//