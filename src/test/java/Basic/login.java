package Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {

		//for chrome driver
		WebDriverManager.chromedriver().setup();     //setup chrome driver 
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    //for firefox driver
	    // WebDriverManager.firefoxdriver().setup();  //setup firefox driver
	    
	    // FirefoxDriver driver = new FirefoxDriver();
	    
	    
	    //for edge driver 
	    // WebDriverManager.edgedriver().setup();     //setup edge driver 
	    
	    // EdgeDriver driver = new EdgeDriver();
		    

	    driver.get("https://www.makemytrip.com/");
		
	
	
	}

}
