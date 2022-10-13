package Basic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

	    WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
				
	    driver.manage().window().maximize();
		
       
	   //iframe
	    WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
         
        driver.switchTo().frame(iframe);      //this code show we switch to iframe from normal page by webelements 
	
	    WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']//child::div[3]"));
	   
	    Thread.sleep(3000);
	   
	    Actions action = new Actions(driver);
	   
	    action.dragAndDropBy(resize, 150, -70).perform(); 
	
	    File screenshot = driver.getScreenshotAs(OutputType.FILE);  //this getScrenshot method is used to capture the screenshot and save in specified location and save as file  
	
	    //following code shows where we save the screenshots and in which format 
	    // FileUtils.copyFile(screenshot, new File(".//target//screenshot.png") );    w/o date and time//copy and save in perticular location //not much useful 
	
	    
	     FileUtils.copyFile(screenshot, new File(".//target//screenshot" + timestamp()+ ".png ") );    //copy and save in perticular location  //with date and time

	
	}
	
	public static String timestamp() {
		return new  SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
		
		
	}

}


//here File is existing class fromm input output package 
//here File Screenshot means = screenshot reference variable main screenshot save kiya hai
//driver elements ko lara hai by using findElements then we give it to WebElements reference variables 
//now here driver screenshot lata as file type then we give it to file classreference variable 
//FileUtils = file ki ulitity means uske sath apko krna kya hai
//new keyword space ke liye use hota hai
//(".//target//screenshot")=== target is a folder name where we want to save the screenshot and screnshot is file name .....
//here we can change folder name i.e. target and file name also
//agar date and time nahi rakhte hai toh new screenshot overlap previous screenshot 
//return new = every time new time chahiye isaliye









