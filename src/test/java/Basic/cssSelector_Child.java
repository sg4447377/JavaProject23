package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector_Child {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();     //setup chrome driver 
			
	     ChromeDriver driver = new ChromeDriver();
	    
		 driver.get("https://www.flipkart.com/");

		 driver.manage().window().maximize();       //used for screen maximize //preferable

         Thread.sleep(3000);

         driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();   //for close login window
	
         Thread.sleep(3000);
         
         driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);   //for search moiles on searchbox

	     //select first-child 
	     driver.findElement(By.cssSelector("div[class='_5THWM1']>*:first-child")).click();  // sort by  child  menas first  one  
 
        //Select last-child 
	     driver.findElement(By.cssSelector("div[class='_5THWM1']>*:last-child")).click();  //newewest first child  menas last one  

        //select nth-child 
	     driver.findElement(By.cssSelector("div[class='_5THWM1']>*:nth-child( 5)")).click();  //price hight to low child 
	
	
	
	}

}


//here parent should be unique 
//child ka values same rehega  toh hum parent ke throgh child tak jayenge 
//cssSelector by direct  child   syntax using any atrributes (on child based)
//HTMLTag of parent[attributesname of parent  ='attributevalue of parent ']>*:first-child == first child pe jane ke liye 
//HTMLTag of parent[attributesname of parent ='attributevalue of parent ']>*:last-child == last child pe jane ke liye 
//HTMLTag of parent[attributesname of parent ='attributevalue of parent ']>*:nth-child(number) == nth child (menas in between child )pe jane ke liye 

//cssSelector by indirect child syntax (ignore)
//Indirect child bhi hai but problem is that it will go to first child by defult
//indirect child is not recomendeted
//HTMLtag of parent[parentattributes name = 'parent attributes value ']htmltag of any child (pick randomly)

//types of parent child syntax (on type base)
//1) HTMLTag of parent[atrribute name of parent ='attributes value of parent']>HTMLtag of child :first-of-type;  //first child pe jayega 
//2) HTMLTag of parent[atrribute name of parent='attributes value of parent']>HTMLtag of child :last-of-type;  //last child pe jayega 
//3) HTMLTag of parent[atrribute name of parent='attributes value of parent']>HTMLtag of child :nth-of-type(number );  //in between  child pe jayega 














