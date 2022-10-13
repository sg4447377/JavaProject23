package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFacebok_cssSelector {

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/\r\n");
				
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']"));
	
	email.sendKeys("7020625992");
	
	Thread.sleep(3000);

	driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("HashTag@Shital_1996");
	
	Thread.sleep(3000);

    driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	

	}

}
