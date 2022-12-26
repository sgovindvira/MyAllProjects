package PracticeTestNGYoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	
	
	@Test(priority =1)
	public void firstTestNG() throws InterruptedException { 
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
	
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium java", Keys.ENTER);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.quit();
	
	
	

	
	
	}
	
	
	
	
	
	@Test(priority =2)
	public void SecondTestNG() throws InterruptedException{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("selenium java", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}
}
