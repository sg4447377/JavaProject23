package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wait_explicitly {

	public static void main(String[] args) {

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
		
          //Explicitly wait //this mostly used 
		 // WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(30));  //object created of WebDriverWait class which is already predefined
		 // wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class='logout']"))).click();   //here driver 30 sec krega jab tak wo logout element clickable nhi hota
		  
		  //or
		
		  WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(30));  //object created of WebDriverWait class which is already predefined
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='logout']")));   //here driver 30 sec krega jab tak wo logout element visible nhi hota
		  
		 driver.findElement(By.cssSelector("a[class='logout']")).click();
		
	
	}

}

//close and quite = diffrence in 11 sept 2022 lecture 
//Explicitly wait = if we want to give wait for perticular elemt then we can use explicitly wait 
//this wait is not applicable for all if i put before logout then it will applicable only to logout 
//not for elements which is after and before  logout 
//by using explicit wait commands ,the webdriver is directed to wait until certain condition occurs before proceeding with executing the code 
//setting explicit wait is important in cases there are certain elements that naturally take more time to load 
//if one set implicit wait command,then the browser will wait for the same time frame before loading every web elements 
//.and this cuase  unnecessary  delay in excuting the test script 
//explicit wait is more  but it can applied only for specific element 
//disdavantages of implicit wait =
//1) because it applicable to all elements present in programm so it cause unnessary delay in  executing test script 
//explicit is smarter than implicit wait ,
//disadvantages for explicit wait =
//1) if there is more than 2 elements in one program the we have to put separate explicitly wait for all the element in program  because it is applicable only specific element
//expectedcondition used commonly ==
//1) alertisPresent()
//2)elementToBeClickable()
//3)elementToBeSelected()
//4)visibilityOfAllElementLocatedBy()
//5)visibilityOfElementLocated()
//NostaleElement  exception is handled by fluent wait ye ata hai jab element present nahi toh element disabled hota hai 
