package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_child {

	public static void main(String[] args) throws InterruptedException {

	
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
					
		driver.manage().window().maximize();
		
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();   //for close login window

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER); 

        Thread.sleep(3000);

       //womens and offer zone 

        driver.findElement(By.xpath("//div[@class='_1kidPb']//child::span[4]")).click();
	    
        Thread.sleep(3000);

	    driver.findElement(By.xpath("//div[@class='_1kidPb']//child::a[2]")).click();

        Thread.sleep(3000);

	  //relevence and popularity
	    
	   /* driver.findElement(By.xpath("//div[@class='_5THWM1']//child::div[2]")).click();
       
	    Thread.sleep(3000);
 
	    driver.findElement(By.xpath("//div[@class='_5THWM1']//child::span[1]")).click();*/

 
	    
	}

}
