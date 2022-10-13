package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	    
		 driver.get("https://www.flipkart.com/");

		 driver.manage().window().maximize();       //used for screen maximize //preferable

		 WebElement username = driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']"));
	   
		 username.sendKeys("shitalgurnule7@gmail.com");
		 
		 WebElement password = driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']"));

	     password.sendKeys("Shital@1234");
	     
		 WebElement login = driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']"));

	      login.click();
	
	}

}




//cssSelector is locator we can use it by id and classname and nay attributes also 
//css = cascading style sheet 
//css used for colouring and minimize and button colours also ,border,fonts
//css selector using id 










