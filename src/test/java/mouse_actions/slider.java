package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
				
	    driver.manage().window().maximize();
		
       
	   //iframe
	   WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
         
       driver.switchTo().frame(iframe);      //this code show we switch to iframe from normal page by webelements 
	
	  WebElement sliderForward =  driver.findElement(By.xpath("//div[@id='green']//child::span"));
	
	  Actions green = new Actions(driver);
	  green.dragAndDropBy(sliderForward,100,0).perform();
	
	  Thread.sleep(3000);
	   
	  
	  //Assignment red backward with different locators
	  WebElement sliderBackward =  driver.findElement(By.xpath("//div[@id='red']//child::span"));
		
	  Actions red = new Actions(driver);
	  red.dragAndDropBy(sliderBackward,-90,0).perform();
	
	
	
	
	
	
	}

}
