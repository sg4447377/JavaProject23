package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_contain {

	public static void main(String[] args) throws InterruptedException {

		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
						
			driver.manage().window().maximize();
			
	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();   //for close login window

	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("smart watches for women waterproof fastrack" + Keys.ENTER); 

	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//div[contains(@class,'_4rR01T')]")).click();   
	        
	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//div[contains(@class,'IMZJg1')]")).click();   
	        
	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//span[contains(@class,'_3IATq1')]")).click(); 
	        
	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _1KAjNd')]")).click(); 

	
	
	
	
	
	
	
	
	}

}
