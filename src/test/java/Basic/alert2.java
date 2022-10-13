package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert2 {

	public static void main(String[] args) throws InterruptedException {

		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
						
			driver.manage().window().maximize();
			
	     
			//1st example = ok and cancle alert
			/* driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	
		   // driver.switchTo().alert().accept();   //to allow the alert //to click on ok or allow

		   Thread.sleep(3000);
	        
	       driver.switchTo().alert().dismiss(); */  //to cancle the alert //to click on cancle or block

	
	      //2nd example = text written alert 
			
		  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		   Thread.sleep(3000);

		   Alert alertwindow = driver.switchTo().alert();

		 // System.out.println("message on alert is : " + alertwindow.getText());  /this is for checking the msg on console
		  
		  Thread.sleep(3000);

		  alertwindow.sendKeys("Welcome to alert demo");
	
		  alertwindow.accept();
	
	}

}


//Alert is predefine class in selenium.
//