package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.ExcelUtilities;
import Utilities.SeleniumUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Excel_utilities {

	 @Test(dataProvider="LoginData")
		public  void login(String userValue,String pwdValue) {
	    	
		 SeleniumUtilities  su = new SeleniumUtilities();
		 WebDriver driver = su.setUp("chrome", "https://demo.actitime.com/login.do");
		  
		  /*
	         WebDriverManager.chromedriver().setup();
			 
			 ChromeDriver driver = new   ChromeDriver();
			 
			 driver.get("https://demo.actitime.com/login.do");
			 
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
		*/
			 
			 driver.findElement(By.id("username")).sendKeys(userValue);
			 
			 driver.findElement(By.className("pwdfield")).sendKeys(pwdValue);

			 driver.findElement(By.id("loginButton")).click();
			   
	    
  }
	 
	 @DataProvider(name = "LoginData")
	   public String[][] loginValues() throws IOException{      //this method is used for supplying data 
		   
		   //Read data from excel and store in array 
		   ExcelUtilities ddt = new ExcelUtilities();                   //
		   int totalrows = ddt.getRowCount("sheet1");
		   int totalcols = ddt.getCellCount("sheet1",1);
		   String[][] loginData = new String[totalrows][totalcols];
		   
		  //this is for  rows
		   for(int i=1; i<totalrows;i++ ) {
			   
			   //this is for column 
			   for(int j =0 ;j<totalcols;j++) {
			       loginData[i-1][j]= ddt.getCellData("sheet1", i, j);

			    }
		  
		   }
		   return loginData;
		   
	   }
	 
	 


}
