package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginAmazon_cssSelector {

	public static void main(String[] args) throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D59248868592%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIv_ny5cbs-QIVDY3CCh2YVACuEAAYASAAEgLtyfD_BwE%26hvadid%3D486399289420%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007786%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D8253529988067568290%26hvtargid%3Dkwd-298301462104%26hydadcr%3D5622_2175700%26ref%3Dpd_sl_7ka89exrd8_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
					
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.cssSelector("input[class='a-input-text a-span12 auth-autofocus auth-required-field']"));
		
		email.sendKeys("7020625992");
		
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("amazon@1996");
		
		Thread.sleep(3000);

	    driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		

		}

	}


