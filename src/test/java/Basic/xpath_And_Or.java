package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_And_Or {

    public static void main(String[]args) {
    	
    	 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	
		 driver.get("https://demo.actitime.com/login.do");
		 
		 driver.manage().window().maximize();  
    	
         //And = username 
		 driver.findElement(By.xpath("//input[@class='textField' and @paceholder='Username']")).sendKeys("admin");
    
         //OR = password 
		 driver.findElement(By.xpath("//input[@placeholder='Password' or @class='textField pwdfield']")).sendKeys("manager");

    
    }

}


//1)xpath with And syntax = when we doesnt get unique attributes by using single then by using AND we can use two attributes at a time and get unique one//here both condition should be right  
//"//HTMLTag[@firstAttributes='value' and @SecondAttributes='value']"//and capital bhi ho skta hai space rahe ya nahi rahe no matter
//2)xpath with OR syntax =  single condition should be right //dono condition ek sath check hogi 
//"//HTMLTag[@firstAttributes='value' or @SecondAttributes='value']"//or capital bhi ho skta hai space rahe ya nahi rahe no matter
//or main agar humne galt value dal di aur agar dusri jagah vaise value use mili toh wo directly jump krega.
//or main page pe usko jo chiz first milegi wo uspe jump krega
//firstly html tag check krega 
//And main attributes ko unique banane ke jada chance hote hai


