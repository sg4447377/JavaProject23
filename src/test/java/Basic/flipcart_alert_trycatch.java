package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipcart_alert_trycatch {

	public static void main(String[] args) throws InterruptedException {

	        WebDriverManager.chromedriver().setup();
				
			ChromeDriver driver = new ChromeDriver();
			
		    driver.get("https://www.flipkart.com/");
						
			driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));     //latest one new one 

		    driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();   //for close login window

		    driver.findElement(By.xpath("//div[@class='_37M3Pb']//child::div[8]")).click();   //for click on travel button

	       try {
	   	   
	    	   driver.switchTo().alert().accept();  

	       }
	       catch(Throwable ex ) {
	    	  
	    	   System.out.println("Exception handle for alert " + ex);
	    	   
	       }
	
		   Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//div[text()='Round Trip']")).click();   //for click on round trip button 

	
    }

}


//if exception aata hai try catch block in alert main it will gives u accuracy