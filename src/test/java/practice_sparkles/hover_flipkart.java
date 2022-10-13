package practice_sparkles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hover_flipkart {

	public static void main(String[] args) throws InterruptedException {

		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver =new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();  //click on close icon
			
			driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);  //search box
			
	        WebElement element= driver.findElement(By.xpath("//span[text()='Electronics']"));
	
	       // Actions action =new Actions(driver);
	       
	       // action.moveToElement(element).perform();
	        
	        element.click();
	        
	        Thread.sleep(3000);
	       
	        driver.findElement(By.xpath("//a[@title='Realme']")).click();
	
	
	
	
	}

}
