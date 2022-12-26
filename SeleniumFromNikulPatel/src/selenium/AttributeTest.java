package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
	
	// classname objectname  = new classname();
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.ebay.ca/");
	
	String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
	System.out.println(s);
	
	
     
	
	
	driver.findElement(By.id("gh-ac")).sendKeys("iPHONE");
	

	
	//If we want know what we have typed in search box
	// its always this function
	
	String A = 	driver.findElement(By.id("gh-ac")).getAttribute("value");
	
	System.out.println(A);
	
	
	
	
	
	}

}
