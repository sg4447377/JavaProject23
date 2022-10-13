package practice_sparkles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automation_practice {

	public static void main(String[] args) throws InterruptedException {

	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	
	driver.switchTo().alert().accept();
	
	WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions action = new Actions(driver);
	
	action.dragAndDrop(drag,drop).perform();
	
	Thread.sleep(3000);
	
	WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	
    action.dragAndDropBy(resize, 20, -80).perform();
	
    
	
	
	
	
	
	}

}
