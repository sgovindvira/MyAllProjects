package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) {
		
		
		
		
		String browser ="Firefox";
		
	
	
		WebDriver driver = null;
		
		
		if(browser.equals("Firefox")) {	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
		
		
		} else if (browser.equals("Chrome")) 
		
				{System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");
			
			 driver = new ChromeDriver();}
		
		
		
		driver.get("https://www.facebook.com/");

		
		
		driver.findElement(By.name("email")).sendKeys("1234567890");

		//Password input
		driver.findElement(By.id("pass")).sendKeys("asdfghjk");		
		
		//Login button
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		
		

	}

}
