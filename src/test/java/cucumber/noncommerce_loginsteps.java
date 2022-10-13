package cucumber;

import org.openqa.selenium.WebDriver;

import PageObject.login_nopcommerce;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class noncommerce_loginsteps  {

	 public static WebDriver driver;
     public login_nopcommerce loginPage;
	 
	 
	 
	 @Given("Launch browser")
	 public void launch_browser() {
	
	 }

	 @When("user opens url {string}")
	 public void user_opens_url(String string) {
	
	 }

	 @And("enter email as {string} and password as {string}")
	 public void enter_email_as_and_password_as(String email, String password) {
	
	 }

	 @Then("click on login")
	 public void click_on_login() {
	
	 }
	
	
 }
