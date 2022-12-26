package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		
	driver.findElement(By.cssSelector("#email")).sendKeys("Samgovval");
	driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi")).sendKeys("123456");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
