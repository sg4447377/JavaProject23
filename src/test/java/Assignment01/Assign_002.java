package Assignment01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_002 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		
		WebElement getname = driver.findElement(By.xpath("//a[@class='userProfileLink username ']"));
		System.out.println("WELCOME = " + getname.getText());
				
		
	  }
	

	}


