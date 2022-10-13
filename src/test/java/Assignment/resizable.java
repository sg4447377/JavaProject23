package Assignment;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resizable {

	public static void main(String[] args) throws InterruptedException {
 
		   WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/resizable");
					
						
			driver.manage().window().maximize();
	
	        //Iframe by xpath 
			//WebElement  iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			
			//driver.switchTo().frame(iframe);
			
			//or
           
			//Iframe by cssSelector
			WebElement  iframe = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
			
			driver.switchTo().frame(iframe);
			
			//WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']//child::div[3]"));
			
			WebElement resize = driver.findElement(By.cssSelector("div[id='resizable']>*:nth-child(3)"));

			Thread.sleep(3000);
	
	        Actions action = new Actions(driver);
	
	        action.dragAndDropBy(resize,50,10).perform();
			
	        Thread.sleep(3000);

	        action.dragAndDropBy(resize,-50,70).perform();
	       
	        Thread.sleep(3000);

	        action.dragAndDropBy(resize,30,-30).perform();
	       
	        Thread.sleep(3000);

	        action.dragAndDropBy(resize,-50,-30).perform();

	
	
	
	
	
	}

}
