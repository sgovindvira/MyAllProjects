package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); // About  title
		
		
		driver.navigate().back(); 
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); // google  title
		
		
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle()); // about  title
		
		
	
		
		

		
	}

	
}
