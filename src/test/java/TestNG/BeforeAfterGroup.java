package TestNG;

import org.testng.annotations.Test;

public class BeforeAfterGroup {

   
	
	@Test(groups = {"Regression"} )
	public void method1() {
    	System.out.println("Method 1");
    	
    }

    @Test(groups = {"Sanity"})
    public void method2() {
    	System.out.println("Method 2");
    	
    }

    @Test(groups = {"Regression","Sanity"})
    public void method3() {
    	System.out.println("Method 3");
    	
    }








//Third method jaise or ki tarah kam krega 
//jaise abhi third method main (regression aur sanity ) dono hai toh includes main agar dono hai toh wo run hoga agar ek bhi raha toh bhi run hoga 
//(regression , smoke )   toh bhi run hota  kyu ki regression includes hai  
//parallel execution is possible in testNG = different different threads same time pe memory utilisation kr skta hai 
//parallel execution main sequence ke saath comprimise krna pdta hai
//parallel execution tab use krenge jab program bda hoga 
//parallel execution mdhe priority maintain nahi krt methods 
//but by annotation ke sath work krega ,,,,,
//BeforeTest and @AfterTest ke samne priority nahi de skte hai 
 //but groups de skte hai ,,,,,parameters bhi de skte hai. 









}
