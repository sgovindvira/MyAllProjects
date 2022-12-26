package PracticeTestNGYoutube;

import org.testng.annotations.Test;

public class searchBuyPhone {
	
	@Test(priority =1)//We have to define priority 
	public void search() {
		
	System.out.println("SeachingPhone");}
	
	
	
	
	
	
	
	@Test(priority =2)
	
	public void  selectPhone() {
		System.out.println("Selecting Phone");
		
	}
	
 @Test (priority=3)
 
  public void checkout() {
	 System.out.println("Checkout");
 }

		
		
		
		

	}

