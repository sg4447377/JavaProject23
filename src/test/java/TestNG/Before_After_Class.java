package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_After_Class {

    @Test  
	public void method1() {
    	   System.out.println("Method1 of class 1 ");
    	   
       }
       
    @Test  
    public void method2() {
    	  System.out.println("method2 of class 1"); 
    	   
       }


}

class Before_After_Class2 {
	
	@Test
	public void method1() {
		System.out.println("Method1 of class 2");
		
	}
	
	
}

class Before_After_Class3 {
	
	@BeforeClass
	public void Before() {
		System.out.println("Before method of class 3");
		
	}

	
	@Test
	public void method1()  {
		System.out.println("Method1 of class 3");
		
		
	}
	
	@Test
	public void method2()  {
		System.out.println("method2 of class 3");
		
		
	}
	
	@AfterClass
	public void After() {
		System.out.println("After method of class 3");
		
	}
	
}



//@BeforeClass class ke upar nahi lagega  perticular method ke upar lagega
//jab kisi class main before class and afterclass method hai toh wo print nahi honge
//but  kisi class main agar @beforeclass aur @AfterClass method hai aur ek @Test method hai toh 
//first before class the Test and then Afterclass method run hongi 
//@BeforeClass , hoga @test ,@AfterClass but ye classes separatly run krega mix nahi krega 
//@BeforeTest jaise
//difference between @BeforeClass and @AfterClass
//@BeforeClass executed classwise 
//@BeforeTest not executed  classwise 
//alphabetical order maintain  krta hai  @BeforeTest main but sirf @Test vali method ko 
//alphabetical order maintain  krta hai  @Beforeclass main but sirf @Test vali method ko
//







     
