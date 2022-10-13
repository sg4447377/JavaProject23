package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice_dropdown_calender {

	public static void main(String[] args) {

	
		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/datepicker/#dropdown-month-year");
					
			driver.manage().window().maximize();
			
		    WebElement dateframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

			driver.switchTo().frame(dateframe);
			
		    WebElement dropdown = driver.findElement(By.xpath("//input[@id='datepicker']"));
            
		    dropdown.click();
		    
		    WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		    Select select = new Select(month);

	        select.selectByVisibleText("Oct");
	        
	        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

		    Select select01 = new Select(year);

	        select01.selectByVisibleText("2021");
	        
	        driver.findElement(By.xpath("//a[@data-date='5']")).click();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
