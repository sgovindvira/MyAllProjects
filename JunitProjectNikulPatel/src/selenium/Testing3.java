package selenium;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class Testing3 {
	@Rule
	public  ErrorCollector err = new ErrorCollector();

	@Test
	public void test6() {
		
		
		String expected = "abc";
		String actual ="abc1";
		
		//For testNG and Junit we dont use if else to check test status
		
		Assert.assertEquals(expected, actual);
		// If test fails it will stop execution of test will move to next test
		
		
		
	}

	
	@Test
	public void test7() {
		System.out.println("Hello, Aftet above test failig printing this");
	}
	
	
	
	@Test
	public void test8() {
		
		String expected = "abc";
		String actual ="abc1";
		System.out.println("before assert");
		
		
		//We use try and catch to keep going with our test when something is failing inside our test
		
		try {
			Assert.assertEquals(expected, actual); }
		catch(Throwable t) {
			System.out.println("I am catch, There is problem");
			err.addError(t);
			
		}
		
		System.out.println("after first assert");
		try {
		Assert.assertTrue("Verify 2>3", 2>3);}
		
		catch(Throwable t) {
			System.out.println("There is probem. I m second catch");
			err.addError(t);
		}
		System.out.println("Last Line after finishing entire code");
		
		
	}
	
	
	
	
	
	
	
	
	
}
