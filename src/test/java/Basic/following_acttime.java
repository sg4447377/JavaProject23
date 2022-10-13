package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class following_acttime {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	
		 driver.get("https://demo.actitime.com/login.do");
		 
		 driver.manage().window().maximize();  
	
		//username 
		
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

		//username with password  by using following
       
		 driver.findElement(By.xpath("//input[@id='username']//following::input[1]")).sendKeys("manager");
		 
		 //login
		 driver.findElement(By.xpath("//input[@id='username']//following::a[1]")).click();

	
	
	
	
	}

}


//following = top to bottom approach 
//following xpath se use kr skte hai 
//syntax = //HTMLTag of top (username)[atrributename='atrributevalue']//following::HTMLTag of 2nd(password)[number]
//why we usw following ====agar top to bottom HTML tag main first main unique attributes hai but second vale ke pass unique attributes nahi hai and ek hi attribute hai  then we can use following
//following main ek hi attributes ke use se use followers nikal skte hai
//hum bich main se kahi bhi jaha se unique nahi mil raha hai vaha se following use kr skte hai
//following option cssSelector main nahi hai


