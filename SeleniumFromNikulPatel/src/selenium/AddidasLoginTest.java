package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("		https://www.adidas.ca/en/account-login	");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("login-email")).sendKeys("samammamma@yahoo.com");
		driver.findElement(By.id("login-password")).sendKeys("asdfghjhgfds");
		
		
		
		
	
		
		JavascriptExecutor j =(JavascriptExecutor)driver;
	
	WebElement login =	driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println(login.getLocation());

	j.executeScript("window.scrollBy(325,25)");
	login.click();
	
 String expected = "Your request timed out – please retry";
 	String actual = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
 	System.out.println("Actul result  =  " +actual);
 	
 	if(expected.equals(actual)) {System.out.println("Pass");}
 	else {System.out.println("Fail");}
	

		 
	
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
