package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown_selectclass {

	public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
					
		driver.manage().window().maximize();
	
	    WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	    
	    Select select = new Select(dropdown);   //Select is a already predefine class in java ....and when we inspect dropdown then we have to used Select class 
	     
	    select.selectByVisibleText("Books"); 
	
	   // select.selectByIndex(4);   //amazon fresh select krna hai //index value start from zero //this is not preferable because if in future there is some extra option added by designer in fron of that index number then it will create problem  
	    
	   //select.selectByValue("search-alias=electronics");  //Electronics select kiya  //dropdown arrow pe inspect krke value nikalo
	
	   //most preferable method is selectByVisibleText()= interview quetions 
	    
	    
	    
  }

}


//for dropdown we have to used select 
//for drag and drop we have to use action action class 