package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider_backward {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/slider/#colorpicker");
					
		    driver.manage().window().maximize();
			
	       
		   //iframe
		   WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	         
	       driver.switchTo().frame(iframe);
	
	       WebElement sliderBackward =  driver.findElement(By.xpath("//div[@id='red']//child::span"));
			
	 	   Actions red = new Actions(driver);
	 	  red.dragAndDropBy(sliderBackward,-90,0).perform();
	 	
	 	
	 }

}
