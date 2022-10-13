package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

    @Test(dataProvider="LoginData")
	public  void login(String userValue,String pwdValue) {
    	 
         WebDriverManager.chromedriver().setup();
		 
		 ChromeDriver driver = new   ChromeDriver();
		 
		 driver.get("https://demo.actitime.com/login.do");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.id("username")).sendKeys(userValue);
		 
		 driver.findElement(By.className("pwdfield")).sendKeys(pwdValue);

		 driver.findElement(By.id("loginButton")).click();
		   
    
   }
    
    @DataProvider(name = "LoginData",parallel=true)
    public String[][] loginValues() {
    	
    	String[][] loginData = {{"admin","manager"},{"trainee","trainee"},{"admin123","password"},{"10","30"}};
    	
    	return loginData; 
    	
    }
    
    
   
    

}





//what is data driven testing = by using this testing we can take the same test case and run it with as many 
//different inputs as you like ,thus getting better coverage from a single test,
//@DataProvider is annotation  = marks amethod as supplying data for test method.
//DataProvider has two parameters = name(the name od this data provider ,if its not suplied,the name of this data provider will automatically be st to the name of the method)  and parallel
//DataProvider as parameters konse annotation ke saath use hota hai .....= @test 
//@Test main kya value pass krte hai = @DataProvider anotation ka parametter i.e name of @dataProvider annotation
//parallel execution krenge toh sequence change hoga ya don tin window ek saath start hogi ,

//