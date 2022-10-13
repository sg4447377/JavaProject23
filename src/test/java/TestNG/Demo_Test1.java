package TestNG;

import org.testng.annotations.Test;


public class Demo_Test1 {

    @Test(priority=1)
	public void payment() {
		System.out.println("payment while booking ticket");
		
		
	}
	
    @Test(priority=2)
	public void ticket() {
		System.out.println("Select ticket for booking ");
		
		
	}
	
    @Test(priority=3)
	public void login() {
		System.out.println("login to IRCTC");
		
	}
    
}
 

class Demo_Test2 {
	
	@Test
	public void redbuslogin() {
		System.out.println("login to Redbus");
		
	}
	
  @Test
   public void redbuspayment() {
	 System.out.println("payment for ticket");  
	   
	   
  
  }

}






//ek class main agar priroty nahi dete hai toh wo alphabetically arun hoga 
//priroty zero menas there is no priority 
//and less prirority run first and large priroty run last 
//means priroty nahi hai wo first runhoga baad main priority vale 
//agar do class hai ek class main sab method ko priority di hai aur dusre class ke method ko nahi di hai toh
//wo dusra class run krega jiski mrthods ko priority nhi di ho 
//aur agar do class hai dono class ke method ko priority hai toh wo pehele first class ki method ko run krega according to priority 
//aur fir dusre class ke method ko run krega according to priority 
//class ko priority method nhi deni hai class wo apni marji se run krega 
//method ko priority deni hai
//priority wise methods hi run honge class nahi 
//


