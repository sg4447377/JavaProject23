package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginactiTime {        

	public static void main(String[] args) throws InterruptedException {

	
         WebDriverManager.chromedriver().setup();     //setup chrome browser in automation script 
		
	     ChromeDriver driver = new ChromeDriver();    //through that code we will able to  invoke and act on the method implemented by chromebrowseronly 
	                                                  // to act with other browser we have to specifically create indivial object for that
	
		 driver.get("https://demo.actitime.com/login.do");   //it is used to open an url and it will wait till the whole page gets loaded 
		 
	    //driver.manage().window().fullscreen();     //used for full screen //not preffered
	    //or
		 driver.manage().window().maximize();       //used for screen maximize //preferable
                                                    //here driver manage the window and maximize it 
		
		//for username  
		WebElement username = driver.findElement(By.id("username"));       //findelement()=used to find the  web element on web page 
	//webelements  is interface ==are anything that present on web page like textbox, button ,link...represent an  HTML element                                                                     //findelements()= used to find list of web elements on web page 
		                                                                   //webelements ke reference varible main dal diya 
		
		//WebElement username = driver.findElement(By.className("input.textField"));     //this is not work classvalue is not unique //we cannot take claaName locator for username field because this is not unique 
		
		username.sendKeys("admin");      //used to enter username  //like nay username we enter 
		
		Thread.sleep(3000);              //used for wait = 3000 enter i.e 3 sec wait after entering username //no need to write this in actual program
		
		//for password
		//WebElement password = driver.findElement(By.name("pwd"));
		//or
		WebElement password = driver.findElement(By.className("pwdField"));  //we use classname locator for password field because it is unique  //here classname is "textfield pwdField" still we use pwdField here because this is unique only and textfiled is not unique
	
	    password.sendKeys("manager");
	    
	    Thread.sleep(3000);
	    
	    //Login
	    WebElement login = driver.findElement(By.id("loginButton"));
	    
	    login.click();
	
	}

}



//locator means = abstract way to find the elements on web page .
//there are 8 traditional locator we use only one at a time 
//most the time we use id 
//locators== name,id ,classname,linktext,partialtext
//if we used classname locator = syntax should be like .classvalue 
//HTMLtag.classvalue , HTMLTag[atrributes='classvalue']
//locator should be unique. 
//if classvalue have space between two words fill them with dot like class = " textField pwdField"
//so we can search like that = HTMLTag.classvalue menas input.textfield.pwdField