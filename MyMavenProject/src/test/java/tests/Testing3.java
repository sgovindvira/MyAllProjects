package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();

  @Test  (priority =1, groups ="sanity")//creating user(
  public void createuser() {
	  
	  System.out.println("I am in home test");
	  System.out.println("before assertion");
	  Assert.assertTrue(2>3, "Verifyinh element");
	  
	 System.out.println("After assertion");
	 Assert.assertEquals("abc", "abc");
	  	 
	 
	  
  }
  
  @Test (priority = 2, dependsOnMethods ="createuser", groups = "sanity" )
 public void edituser() {
	  
	  System.out.println("I am in home test");
	  System.out.println("before assertion");
	  Assert.assertTrue(2>3, "Verifyinh element");
	  
	 System.out.println("After assertion");
	softAssert.assertAll();//Similar to error collector in Junit
	 
}
  
  @Test (priority = 3, dependsOnMethods ="createuser" )
 public void deleteuser() {
	  
	  System.out.println("I am in home test");
	  System.out.println("before assertion");
	  Assert.assertTrue(2>3, "Verifyinh element");
	  
	 System.out.println("After assertion");
	softAssert.assertAll();
}
}