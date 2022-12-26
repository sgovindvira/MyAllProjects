package PracticeTestNGYoutube;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	@Test(priority =1)
	public void firstTestNG() throws InterruptedException { 


		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium java");
		String expected = "selenium java";

		String actual =	driver.getTitle();
		Thread.sleep(2000);
		
		
		
		System.out.println("expecte = "+ expected);
		System.out.println("actual = "+ actual);
		
		
		

		Assert.assertEquals(actual, expected,"Title is mismatch");
		
		
		driver.quit();

}}
