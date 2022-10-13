package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
					
		driver.manage().window().maximize();
		
	    Thread.sleep(3000);

	    driver.findElement(By.xpath("//button[text()='Alert Box : Click Here']")).click();
	    
	    driver.switchTo().alert().accept();   //to allow the alert //to click on ok or allow
	
	  //driver.switchTo().alert().dismiss();   //to cancle the alert //to click on cancle or block
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

//we need to handle alert 
