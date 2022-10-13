package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginflipkart_cssSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
					
		driver.manage().window().maximize();
		
		/*WebElement email = driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']"));
		
		email.sendKeys("7020625992");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("flipkart@1996");
		
	    Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		*/
        driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();   //for close login window

	    Thread.sleep(3000);

        driver.findElement(By.xpath("//div[text()='Top Offers']")).click();
	
	
	
	
	
	
	
	
	
	}

}
