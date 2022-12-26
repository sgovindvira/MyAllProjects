package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {
	
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		
	//FirefoxDriver driver = new FirefoxDriver();
		
		
		//AnotherMethod of calling driver
		
		//PrrentClassName(Interface) objName = new ClassName();
		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
	     email.sendKeys("Samgovval");
	     
	     
	     
	WebElement password = driver.findElement(By.id("pass"));     
	password.sendKeys("123456");
	
	
	WebElement login =driver.findElement(By.name("login"));
	login.click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
