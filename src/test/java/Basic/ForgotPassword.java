package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	
		 driver.get("https://demo.actitime.com/login.do");   //launch browser 
		 
		 driver.manage().window().maximize();    //window maximize 
		 
	     //LinkText = for link like forgot your pwd
	     // WebElement forgotpwd = driver.findElement(By.linkText("Forgot your password?"));  //
	
		 // Thread.sleep(5000);

	     //forgotpwd.click();
	     
	     //or
	     
	     //partial link
		 WebElement forgotpwd = driver.findElement(By.partialLinkText("Forgot"));    //partial link hai isaliye "Forgot your password " main se forgot , your ,password kuch bhi use kr skte hai  
	     
	     Thread.sleep(5000);

	     forgotpwd.click();

	
	}

}
