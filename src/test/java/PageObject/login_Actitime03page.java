package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Actitime03page {

      public WebDriver driver;

     //constructor=
      public  login_Actitime03page(WebDriver ldriver) {        
    	  
    	  driver = ldriver;    //ldriver reprrsent driver means jo bhi ldriver main ara hai wo driver main store hoga 
    	  PageFactory.initElements(ldriver, this);
      }
      
      
      @FindBy(xpath="//a[@id='loginButton']//preceding::input[3]")
      WebElement username;

      @FindBy(xpath="//a[@id='loginButton']//preceding::input[2]")
      WebElement password;

      @FindBy(id="loginButton")
      WebElement login;

      public void setUsername(String uname) {
    	 //uname  stores value "admin" which is came  from  java file  from credential method 
    	  username.sendKeys(uname); 
    	  
      }
      
      public void setPassword(String pwd) {
    	 password.sendKeys(pwd); 
    	  
      }
      
      public void clickLogin() {
    	login.click();  
    	  
      }






}


//@FindBy = is used in page factory to locate and declare web elements using different locators 
//page object model main ek class hota hai 
//cucumber is a softwere tool 
//Behaviour driven dvelopment is a framework 
//Bdd enables the s/w tester to complete test script in plain english 
//how in plain english = cucumber tool uses gherkins language which having keyword like given, when ,and ,then and this keyword have already predefine meaning 
//if requirement is clear then we prefer bdd 
//TDD = if requirement is not clear then we prefer tdd 
//if want to perform unit and fuctional testing and test for low level to high level features then prefer TDD 
//if want to test high level features with multiple scenarion 
//and used to perform fuctional  testing then go with BDD
//DDT = data driven testing =  types of data driven testing = 
//1) comma separated values 
//2) excel sheet 
//3) tables database 
//4) script arrays 
//5) table varaibles 
//what is DDT = data that is external to your fuctional test 
// and is loaded and used to extend your automated test cases . you cam take the same test case and run it with aa many different 
//inputs u like .thus getting better coverage from a single test 
//some people DDT called as approach 
//Design pattern in test automation framewoek  == ex= lifstyle of people 
//Design pattern are defined as the best practices that a programmer must follow to amplify code reusability in a framework 
//design pattern explain how to plan test automation test ware ti be useful and easy to manintain 
//commonly used design pattern are page object model and page factory pattern 
//page object model main do file rehegi ek page object file jisme locators rehenge 
//dusri file test case file(java file ) jisme methods ,logic/scripts rahegi
//yeh kyu use krna hai page object model file vaigera toh in future main loctaors change ho gye toh sirf page object file main hi change krna rahega 
//
//