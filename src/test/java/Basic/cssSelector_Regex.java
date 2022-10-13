package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector_Regex {

	public static void main(String[] args) {

	
		WebDriverManager.chromedriver().setup();     //setup chrome driver 
		
	     ChromeDriver driver = new ChromeDriver();
	    
		 driver.get("\"https://demo.actitime.com/login.do\"");

		 driver.manage().window().maximize();    
	
	     driver.findElement(By.cssSelector("")).sendKeys(args);
	
	     
	
	
	
	}

}


//Regex used when values are getting dynamically changed.
//types =
//1) Starts with or Begins with syntax (^) values last vali changes hogi baki same rahega.....starting values should be same 
           // HTMLTag[attributesname^='value(enter those value which is not change ,number ko nahi dalna hai jo har baar changed hora hai']
  //ex= id = "user-name_1";
  //    id = "user-name_22;
  //    id = "user-name_39;
  //so we can write like = // HTMLTag[attributesname^='value(enter those value which is not change ,number ko nahi dalna hai jo har baar changed horga
                            //input[id^user-name_]

//2)Ends with ($) starting value change hoga .....ending value should be common 
           //HTMLTag[attributesname$='value']
    //ex= id = "1_user-name";
    //    id = "22_user-name;
    //    id = "39_user-name;
    //so we can write like =  //HTMLTag[attributesname$='value']
                             //input[id$='_user-name']


//3)contain (*)== used when statring  values common and also when ending values common  and also between value are common 
      //ex=  id = "1_user-name";
           //id = "user-name_1;
           //id = 3_user-name_abcd;
    //syntax =  HTMLTag[atrributesname = 'value'(same vali only)]
           //   input[id*="user-name"]

//we cannot automate captcha because it changed everytime
//otp also one example because it also changed
//google images
//values agar hamehsa new aari ho aur ek hi atrributes ho toh automate krna difficult ho skta hai ...parent through jane ki koshish kro 
//interview que = how to handle dynamically changed web elements =
//Ans =1) using regex  with cssSelector we can try to handles gynamically changing web elements 
//2)other wise we can also try parent child with cssSelector if parent value is unique is not getting changed everytime
//but if entire value getting changed dynamically and no attributes is present then we wont be able to handled 
//
//






