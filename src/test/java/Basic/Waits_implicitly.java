package Basic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits_implicitly {

	public static void main(String[] args) {

	
		     WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
		     ChromeDriver driver = new ChromeDriver();
		
			 driver.get("https://demo.actitime.com/login.do");
			 
			 driver.manage().window().maximize();      
			
			//implicit wait  or implicitly wait 
		  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      //depreciated
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));     //latest one new one 
			 
		    //for username  
			WebElement username = driver.findElement(By.cssSelector("input[id='username']"));      
			username.sendKeys("admin");
			
			//for password
			WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));  //we use classname locator for password field because it is unique  //here classname is "textfield pwdField" still we use pwdField here because this is unique only and textfiled is not unique
		    password.sendKeys("manager");
		    
		    //Login
		    WebElement login = driver.findElement(By.cssSelector("a[id='loginButton']"));
		    login.click();
		

		   //logout
	       WebElement logout = driver.findElement(By.cssSelector("a[class='logout']"));
	       logout.click();
	
	}

}

//waits =
//waits is similar to Thread.sleep()
//Thread.sleep is part of java basically part of synchronisation 
//Thread.sleep is not recommennded in selenium
//what are wait command  in selenium webdriver??
//the waits commands are essential when it comes to executing selenium tests
//they helps to observe and troubleshoot issues that may occur due to variation in time lag(time between actual and expected)
//waits is basically used to prevents the "Elements Not Visisble" exception
//"Elements Not Visisble" exception  apperas when a perticular web elements with which webdriver has to interact ,is delyaed in its loading 
//what are wait commands ??
//ans= wait commnads are important for executing automates test scripts 
//why are wait commands used ??
//ans- whaen a page loads on browser ,various web elements on it with may load at different time interval 
// wait commands direct a test script to pause for a certain time befor throwing an ElementsNotVisible exception 
// Types of wait commands =
//1) Implicit wait 
//2) Explicit wait 
//3) Fluent wait 
//1)Implicit wait = implicit wait directs the selenium Webdriver to wait for a certain measure of time before throwing an exception .once this time 
//is set ,Webdriver will wait for the element before the exception occurs.
//implicit wait statring main use krna hai jab driver elements find krne ka kam shuru krta hai.
//logout se pehele kyu nhi likha ??
//Ans= statring main use krte hai toh driver tab jo bhi kam krege uspe wait apply hoga 
//jaise yaha pe implicitly  wait  username password and login ko bhi apllicable hai automatically 
//it is ideal to put it at starting 
//anhi kaise work kra hai 
//toh wait 30 second username main ko gya ....lekin driver ne pure 30 sec wait nhai kiya agar 2sec main mila element to wo aage ka element  dhundne jayega aur dusre elements ko 30sec firse 
//milega firse agar jaldi mila toh leke aage jayega pure 30 sec wait nhi krega ...like this
//agar kisi bhi element ne diye gaye time se jada liya load hone ke liye toh exception aayega





