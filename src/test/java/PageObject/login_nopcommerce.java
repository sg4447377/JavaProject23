package PageObject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_nopcommerce {

     public WebDriver ldriver;

   public login_nopcommerce(WebDriver ldriver) {   //constructor 
   // ldriver = rdriver;
	//PageFactory.initElements(rdriver,this);
	
}
   @FindBy(xpath="//input[@id='Email']")
   WebElement email;

  @FindBy(xpath="//input[@id='Password']")
  WebElement password;

  @FindBy(xpath="//button[@type='submit']")
  WebElement login;
  


  public void setemail(String uname) {
      email.clear();
	  email.sendKeys(uname);

  }
  
  public void setpwd(String pwd) {
	  password.clear();
	  password.sendKeys(pwd);
  }
  
 
  public void setlogin() {
	  login.click();
 
  }
  
  
  
}
