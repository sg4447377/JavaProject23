package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquery_datepicker {

	public static void main(String[] args) {

	    WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker");
				
					
		driver.manage().window().maximize();
		
	    WebElement dateframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(dateframe);
	    
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    driver.findElement(By.xpath("//span[text()='Next']")).click();

	
	    driver.findElement(By.xpath("//a[@data-date='5']")).click();

	
	
	
	
	
	
	
	}

}
