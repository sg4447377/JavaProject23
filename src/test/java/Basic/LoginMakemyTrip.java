package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginMakemyTrip {

	public static void main(String[] args) {

         WebDriverManager.chromedriver().setup();     //setup chrome driver 
		
	     ChromeDriver driver = new ChromeDriver();
	    
		 driver.get("https://www.makemytrip.com/");

		 driver.manage().window().maximize();       //used for screen maximize //preferable

		 WebElement username = driver.findElement(By.id("username")); 
	
		 username.sendKeys("shitalgurnule7@gmail.com");
		 
		 WebElement login  = driver.findElement(By.id("sw")); 

		 login.click();
		 
	
	
	
	
	}

}
