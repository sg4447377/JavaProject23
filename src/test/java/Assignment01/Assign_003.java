package Assignment01;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_003 {

	public static void main(String[] args) throws IOException {

		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.demoblaze.com/index.html");

			driver.manage().window().maximize();
		
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));     //latest one new one 

             driver.findElement(By.xpath("//a[text()='Iphone 6 32gb']")).click();
             
             WebElement add_tocart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
             
             add_tocart.click();
             
            //Alert alert = driver.switchTo().alert();
	
	        //alert.accept();
	
             driver.findElement(By.xpath("//a[text()='Cart']")).click();

             driver.findElement(By.xpath("//button[text()='Place Order']")).click();

             driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Virat");

             driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");

             driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Mumbai");

             driver.findElement(By.xpath("//input[@id='card']")).sendKeys("9876543210123");

             driver.findElement(By.xpath("//input[@id='month']")).sendKeys("September");

             driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2022");

             driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();

     	    File screenshot = driver.getScreenshotAs(OutputType.FILE); 
   	    
     	    FileUtils.copyFile(screenshot, new File(".//target//screenshot" + timestamp()+ ".png ") );    

            
	
	}
	
	   public static String timestamp() {
		  return new  SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
		
		
	}


}
