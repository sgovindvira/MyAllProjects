package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiabankAllLinks {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		
		Thread.sleep(5000);
		
	List <WebElement> allLinks =	driver.findElements(By.tagName("a")); // This should give us all links presents in Webpage
	
	System.out.println("All Links present on scotibank Website ="  +  allLinks.size());
		
	
	for (int i =0; i<allLinks.size(); i++) {System.out.println(allLinks.get(i).getText());}
		
	}

}
 

