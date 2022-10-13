package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class globalsqa_iframedragdrop {

	public static void main(String[] args) {

	
		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
						
			driver.manage().window().maximize();
			
			//switch to iframe
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			
			driver.switchTo().frame(iframe);
	
	       WebElement  drag = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	       WebElement  drop = driver.findElement(By.xpath("//div[@id='trash']"));
	       
	       Actions action = new Actions(driver);
		   action.dragAndDrop(drag, drop).perform();
			
	       //for restoring the image.
		   WebElement recycle = driver.findElement(By.xpath("//a[@class='ui-icon ui-icon-refresh']" ));
		   recycle.click();
	
	
	
	
	
	}

}
