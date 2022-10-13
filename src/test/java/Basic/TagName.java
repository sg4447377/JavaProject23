package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName {

	public static void main(String[] args) {


         WebDriverManager.chromedriver().setup();     //setup chrome driver 
		
	     ChromeDriver driver = new ChromeDriver();
	
		 driver.get("https://demo.actitime.com/login.do");
		 
	    //driver.manage().window().fullscreen();     //used for full screen //not preffered
	    //or
		 driver.manage().window().maximize();
		 
		
		 //username by tagName
		  driver.findElement(By.tagName("input")).sendKeys("admin");
	
		//password
		  driver.findElement(By.tagName("input")).sendKeys("manager");
  
		 
		 //login by tagname 
		 driver.findElement(By.tagName("a")).click();

	     
	
	}

}

//it will not give unique one so not work
