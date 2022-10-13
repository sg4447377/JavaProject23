package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector_Id {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	    
		 driver.get("https://www.saucedemo.com/");

		 driver.manage().window().maximize();       //used for screen maximize //preferable

        //username
	    // driver.findElement(By.id("user-name"));   //by normal id locator
		 
		 WebElement username = driver.findElement(By.cssSelector("#user-name"));    //by css selector using id attributes value 
	    //or 
		 WebElement username1 = driver.findElement(By.cssSelector("input#user-name"));    //by css selector id attributes value with html tag 

	   //password by cssSelector using id attributes
		 WebElement password = driver.findElement(By.cssSelector("#password"));    //by css selector using id attributes value 
        //or
		 WebElement password1 = driver.findElement(By.cssSelector("input#password"));    //by css selector using id attributes value with html tag

		 
	     //css selector by using class atrributes for login button
		 WebElement login = driver.findElement(By.cssSelector(".submit-button.btn_action"));    //by classvalue
        //or
		 WebElement login1 =driver.findElement(By.cssSelector("input.submit-button.btn_action"));    //htmltag 
        //or
		 WebElement login2 =driver.findElement(By.cssSelector(".submit-button"));    //by partial value  
        //0r
		 WebElement login3 =driver.findElement(By.cssSelector("input.submit-button"));    //by partial value  
        //or
		 WebElement login4 =driver.findElement(By.cssSelector(".btn_action"));    
        //or
		 WebElement login5 =driver.findElement(By.cssSelector("input.btn_action"));    

	     
	 }

}

//syntax of cssSelector by using id atrributes---->>>> 
//#idValue or HTML_Tag#idValue=== for eg. #user-name or input#user-name
//syntax of cssSelector by using class atrributes ---->>>> 
//.classvalue(if space is there filled with dot)  or htmltag.classvalue(space filled with dot)
// we can use partial value also in class name attributes 
//syntax of cssSelector by using any attributes---->>>> 







