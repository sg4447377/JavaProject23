package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class global_sqa_assign {

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
					
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//input[@class='name']")).sendKeys("Shital"); 
	
	    driver.findElement(By.xpath("//input[@class='email']")).sendKeys("shitalgurnule7@gmail.com"); 
		
        driver.findElement(By.xpath("//input[@class='url']")).sendKeys("https://www.globalsqa.com/samplepagetest/"); 

        WebElement experience = driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']"));
	
	    Select select = new Select(experience);
	
        select.selectByVisibleText("3-5");
	   
	  // select.selectByIndex(2);
	
	    driver.findElement(By.xpath("//input[@value='Automation Testing']")).click(); 

	    driver.findElement(By.xpath("//input[@value='Manual Testing']")).click(); 

	    driver.findElement(By.xpath("//input[@value='Graduate']")).click(); 

	    driver.findElement(By.xpath("//textarea[@name='g2599-comment']")).sendKeys("I am already login"); 

	    driver.findElement(By.xpath("//button[@class='pushbutton-wide']")).click(); 

	
	}

}
