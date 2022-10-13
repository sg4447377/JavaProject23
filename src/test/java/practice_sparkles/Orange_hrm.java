package practice_sparkles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_hrm {

	public static void main(String[] args) {

	
	  WebDriverManager.chromedriver().setup();
	
	  ChromeDriver driver = new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

	
	  driver.findElement(By.xpath("//button[@type='submit']")).click();

	  driver.findElement(By.xpath("//nav[@aria-label='Topbar Menu']//child::li[3]")).click();
	
	  driver.findElement(By.xpath("//nav[@aria-label='Topbar Menu']//child::li[1]")).click();

	   
	  driver.findElement(By.xpath("//a[text()='Optional Fields']")).click();

	
	
	
	
	
	
	}

}
