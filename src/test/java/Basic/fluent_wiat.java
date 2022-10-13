package Basic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluent_wiat {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	
		 driver.get("https://demo.actitime.com/login.do");
		 
		 driver.manage().window().maximize(); 
	
		 //for username  
		 WebElement username = driver.findElement(By.cssSelector("input[id='username']"));      
		 username.sendKeys("admin");
			
		//for password
		 WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));  //we use classname locator for password field because it is unique  //here classname is "textfield pwdField" still we use pwdField here because this is unique only and textfiled is not unique
		 password.sendKeys("manager");
		    
		  //Login
		  WebElement login = driver.findElement(By.cssSelector("a[id='loginButton']"));
		  login.click();
		
         //fluent wait
		  Wait<WebDriver> wait = new  FluentWait<WebDriver>(driver) //object of fluent wait class
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))  //this code  means after every 5 sec it will check that exceptions occured or not  until 30 sec means 6 times check krega 
		        .withMessage("Triying to click on logout")
		        .ignoring(NoSuchElementException.class);
		  
		  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='logout']"))).click();
		 
		 Thread.sleep(5000);
		  
		  
		  //Forgot Password
		 driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
	
	}



	
}



//fluent wait = 
//fluent wait marks the maximum amount of time for selenium webdriver to wait 
//for acertain condition becomes visible 
//it also checks how frequently webdriver will check if the condition appears before 
//throwing the "ElementNotVisibleException"
//FluentWait is predefine class 


