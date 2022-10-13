package practice_sparkles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown_amazon {

	public static void main(String[] args) throws InterruptedException {

	
	    WebDriverManager.chromedriver().setup();
	
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement dropdown =   driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	    
	    Thread.sleep(3000);
	     
	    Select select = new Select(dropdown);
	
	    select.selectByVisibleText("Furniture");
	
	
	
	
	
	}

}
