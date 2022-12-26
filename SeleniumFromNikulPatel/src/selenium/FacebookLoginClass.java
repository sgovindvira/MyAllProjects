package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		
		// Working on email box
		
		//8 Selenium locators are follow
		
		
		// 1. ClassName
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sam@gmail.com"); //Not working because there is space between class name
		
		//2. ID - working
		
		//driver.findElement(By.id("email")).sendKeys("sam@gmail.com");
		
		
		//3. CSS SELECTOR - Learn 
	//	driver.findElement(By.cssSelector(null));
		
		//4.name - name attriute - working
		
		driver.findElement(By.name("email")).sendKeys("hjkkjbvkfdjkgjfdklvlkdfvlkmvlfdlgerjgjlkerjgregjlrglkefmlj");
		
		
		//5 Link text - only for links(A tags) - not working in this case.
	
		//driver.findElement(By.linkText(null));
		
		
		// 6. Partial link text. Not working here becaue it only works for links
		
	//	driver.findElement(By.partialLinkText(null));
		
		//7 Tag name- not working is its not unique
		
	//	driver.findElement(By.tagName(null));
				
		//8. Xpath - learn syntax
		
	//driver.findElement(By.xpath(null));
	
	
		//Password input
		driver.findElement(By.id("pass")).sendKeys("asdfghjk");		
		
		//Login button
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		

	}

}
