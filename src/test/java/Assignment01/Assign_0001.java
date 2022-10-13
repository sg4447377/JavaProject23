package Assignment01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign_0001 {

	public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));     //latest one new one 

	    driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();   //for close login window

	     WebElement allmenu = driver.findElement(By.xpath("//div[@class='_37M3Pb']"));
		   
	     System.out.println("All menus are  = " + allmenu.getText());

	    /*
	    List<WebElement>obj = driver.findElements(By.xpath("//div[@class='_37M3Pb']"));
		
	     for(WebElement i :obj ) 
	     {
		   String text = i.getText();
		   System.out.println(text);
	     } 
	    */
	
	
	
	
	
	
	
	
	}

}
