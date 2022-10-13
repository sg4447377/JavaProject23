package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)   
@CucumberOptions(
		features={".\\FeatureFile\\login_Actitime03.feature" ,".\\FeatureFile\\login.feature"},     //comma keke multiple locations de skte hai
		glue={"cucumber"},    //java file ke package ka nam likho  //comma krke multiple packages ke name de skte hai
		tags="@Regression",   //optional hai 
		monochrome=true,
		plugin={"pretty" , "html:test-output"}   //for report  test-output folder main rakhna isaliye 
		)
		
		
public class testRun {

}


//.(dot)= means aage jo bhi rahega uske full address ko wo cover kr lega 