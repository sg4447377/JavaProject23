package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parentchild_flipcart {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
					
		driver.manage().window().maximize();
		
        driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
	
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER); 
        
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("div[class='_1kidPb']>*:first-child")).click();   //first child  

       Thread.sleep(3000);

       driver.findElement(By.cssSelector("div[class='_1kidPb']>*:nth-child(4)")).click();   //4th child
      
       Thread.sleep(3000);

       driver.findElement(By.cssSelector("div[class='_1kidPb']>*:last-child")).click();   //last child

       Thread.sleep(3000);

	
	}

}
