package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resizable_action {

	public static void main(String[] args) throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
				
	    driver.manage().window().maximize();
		
       
	   //iframe
	   WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
         
       driver.switchTo().frame(iframe);      //this code show we switch to iframe from normal page by webelements 
	
	   WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']//child::div[3]"));
	   
	   Thread.sleep(3000);
	   
	   Actions action = new Actions(driver);
	   
	   action.dragAndDropBy(resize, 150, -70).perform(); 
	
	
	
	}

}
