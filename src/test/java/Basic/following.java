package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class following {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
					
		driver.manage().window().maximize();
	
       // Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();   //for close login window

	    Thread.sleep(3000);

	    driver.findElement(By.xpath("//div[@class='_37M3Pb']//following::div[30]")).click();
	
	
	
	}

}

//Axes===
// following syntax = 