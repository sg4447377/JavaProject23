package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

    public static WebDriver driver;
	
	@Given("open browser and navigate to url actitime100")
	public void browser() {
       	
    	WebDriverManager.chromedriver().setup();
		 
		 driver = new   ChromeDriver();
		 
		 driver.get("https://demo.actitime.com/login.do");
		 
		 driver.manage().window().maximize();
		 
    	
    }
    
    @When("enter valid username and password actitime100")
    public void credentials() {
       
    	//username
    	driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[3]")).sendKeys("admin");
    			
       //Password
        driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[2]")).sendKeys("manager");
    			
    }			
    
    @And("click on login button actitime100")
    public void validatelogin() {
    	
    	//Login
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		

    	
    }
    
    @Then("click on logout actitime100")
    public void validatelogout() {
    	
	     driver.findElement(By.id("logoutlink")).click();

    }




 }


//feature file and java file name should be same. 
//page object class main locators rahenge
//page factory is predefined class
//page factory in selenium is inbuild page object model framework
//concept for selelnium webdriver but it is very optimised
//it is used for initialisation of page object 
//or to instantiate the page object itself
//it is also used to initialise page class elements without using findelement
//cucumber = is behvaiour driven  development(BDD) 
//testNG = test driven development (TDD)
//cucumber.io = official websites 
//how cucumber will work = 1) describe behaviour
//2) write step defination 
//3) run and fail 
//4)write  code to amke step pass 
//run and pass 
//cucumber supports different s/w platform 
// ruby on rails, selenium , picocontainer, spring framework , watir
//cucumber works in  normal english 
//test case  are  in plain english .
//cucumber uses gherkins 
//gherkins uses a set of keywords to give structure and meaning  to executable specification//
//feature file main @tag , @regression aaise bhi likh skte hai 


