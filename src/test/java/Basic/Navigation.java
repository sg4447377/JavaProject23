package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

	
		 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	    
		 driver.get("https://www.flipkart.com/");

		 driver.manage().window().maximize();       //used for screen maximize //preferable

         Thread.sleep(3000);

         driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();   //for close login window
	
         Thread.sleep(3000);
         
         driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);   //for search moiles on searchbox
	
         Thread.sleep(3000);

	     driver.navigate().back(); //flipkart  homepage
	
         Thread.sleep(3000);

	     driver.navigate().forward();   //again on list page of mobail
          
	     Thread.sleep(3000);

	     driver.close();
	     
	     driver.quit();
	     
	     
	     
	    }

}


//difference between driver.close() and driver.quit();
//driver.close() close the current window ,quitting the browser if its the last window currently open
//driver.quit() quit the driver ,closing the every associated window

