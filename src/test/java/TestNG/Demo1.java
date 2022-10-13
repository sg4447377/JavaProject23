package TestNG;

import org.testng.annotations.Test;

public class Demo1 {

   @Test
	public void login() {
		System.out.println("Login to IRCTC ");
		
		
	}
	
	
	@Test
    public void ticketBooking() {
    	System.out.println("Ticket Booking for IRCTC");
    	System.out.println("Steps1");
    	System.out.println("Steps2");
   
     }
    
    
    
    
 }


//multiple statement hai ek method fir bhi wo ek hi test case hua 
//if we not giving priority then it will run according to alphabetical order od method name 
//but if we giving  priority then it will take less priority to run and large priority test case later 
//and if we give priority as zero then that means there is no priority 
//aur three method hai do ko priroity hai ek ko nahi toh jisko nhi hai priority wo first run hoga and then priority 1 and then priority 2 
//if same priority rahi toh alphabetically lega 
//testng gives report in testoutput folder
//latest report milega privious chla jata hai

