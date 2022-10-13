package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector_2 {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	    
		 driver.get("https://www.saucedemo.com/");

		 driver.manage().window().maximize();       //used for screen maximize //preferable

	     //username 
		 //css selector using any attributes 
		WebElement username  =   driver.findElement(By.cssSelector("input[id='user-name']"));
		//or 
		WebElement username1 =  driver.findElement(By.cssSelector("input[placeholder='Username']"));
        //or
		WebElement username2 =  driver.findElement(By.cssSelector("input[type ='text']"));
		//or
		WebElement username3 =  driver.findElement(By.cssSelector("input[name='user-name']"));
        //or
		WebElement username4 =  driver.findElement(By.cssSelector("input[data-test='username']"));

	
	
	
	
	
	}

}



//syntax of css selector by any attributes 
//mostly use 
//interview main yahi batana hai 
//HTML_Tag[attribute='atributevalue']
//here any attributes main jab class use krte hai toh space ko dot se replace nahi krenge 
//class main partial value bhi unique hona chahiye
//
