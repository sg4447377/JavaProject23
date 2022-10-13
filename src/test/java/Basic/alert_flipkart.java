package Basic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_flipkart {

	public static void main(String[] args) {

       //WebDriverManager.firefoxdriver().setup();
		
	   //FirefoxDriver driver = new FirefoxDriver();
		
	    WebDriverManager.chromedriver().setup();
			
		ChromeDriver driver = new ChromeDriver();
		
	    driver.get("https://www.flipkart.com/");
					
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));     //latest one new one 

	    driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();   //for close login window

	    driver.findElement(By.xpath("//div[@class='_37M3Pb']//child::div[8]")).click();   //for click on travel button

	    /*
	    ChromeOptions options = new ChromeOptions();     //for chrome driver  ..alert notification ko disable krne ke liye option hai
	    //FirefoxOptions options = new FirefoxOptions();//for firefox driver
	    options.addArguments("--disable-notification");
	    */
	    
	    driver.switchTo().alert().accept();  

	    driver.findElement(By.xpath("//div[text()='Round Trip']")).click();   //for click on round trip button 

	    
	    
	    
	    
	    
	    
	    /*  Wait<WebDriver> wait = new  FluentWait<WebDriver>(driver) //object of fluent wait class
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))  //this code  means after every 5 sec it will check that exceptions occured or not  until 30 sec means 6 times check krega 
		        .withMessage("Alert Handling")
		        .ignoring(NoSuchElementException.class);
		  
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Round Trip']"))).click();
		 
	 */
	    
	    
	    // driver.findElement(By.xpath("//div[text()='Round Trip']")).click();   //for click on round trip button 


	
	
	
	}

}


//chrome main yaha alert nahi aara tha isaliye firefox use kiya upe ara hai
