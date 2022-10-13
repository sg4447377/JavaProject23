package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class following_sibling {

	public static void main(String[] args) {

		/* WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	
		 driver.get("https://www.globalsqa.com/samplepagetest/");
		 
		 driver.manage().window().maximize(); 
	
	    //following_sibling 
		
		 
		//In educatiom,select post graduate, Education is the first child of their parent   
		 driver.findElement(By.xpath("//label[text()='Education']//following-sibling::label[2]")).click(); *///............not working
	
	
		//Example 1
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver1 =new ChromeDriver();
			
			driver1.get("https://www.flipkart.com");
			
			driver1.manage().window().maximize();	
			driver1.findElement(By.xpath("//span[@class='_2i7N3j']//following-sibling::div[2]")).click();
			
	
	
	}

}
