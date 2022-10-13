package Basic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switch_window1 {

	public static void main(String[] args) {

	
		 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	    
		 driver.get("https://www.flipkart.com/");

		 driver.manage().window().maximize();       //used for screen maximize //preferable

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));     //latest one new one 

		 driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();   //for close login window
	
         driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);   //for search moiles on searchbox

	     System.out.println(driver.getTitle());     //this gives titles of window
         
         driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9' and @alt='OPPO K10 (Black Carbon, 128 GB)']")).click();
	
	     Set<String> windowID = driver.getWindowHandles();  //handle gives id for one here gethandle is predefine method haing string return type i e. current  window //handles gives id for multiple windows open,most preferable ;gethandles havin set>string return type that why we write set>String
	
	     System.out.println(windowID);   //it will generate idnumber for window
	
	     ArrayList<String> windowIDlist = new ArrayList<String>(windowID);   //ye tab use krrenge jab windows jada nahi honge 
	     
	     //3. option 3 = for each loop    //ye tab use krenge jab window jada honge
          for(String window :windowIDlist) {
	    	 driver.switchTo().window(window).getTitle();   //this is use to to open the multiple window and get their titles //here title nahi ara hai
	    	 
	     }
	     
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();   //Add to cart
	
	    
	    
	  }

}

// that means in how many ways we open the multiple window and get their titles 
//there are 3 ways === 1)by  arraylist 2) by  iterator 3) by  for each loop
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


