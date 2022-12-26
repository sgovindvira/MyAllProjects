package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");
		
		// classname objectname  = new classname();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
	driver.findElement(By.id("email")).sendKeys("Samgovval");
	driver.findElement(By.id("pass")).sendKeys("123456");
	driver.findElement(By.name("login")).click();
		
		
		
		
		

	}

}
