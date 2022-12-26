package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//size and text for header link
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		Thread.sleep(2000);
		
		
      	List	<WebElement> yahoolinks = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
      	System.out.println(yahoolinks.size());
      	
      	
for (int i=0; i<yahoolinks.size(); i++) {System.out.println(yahoolinks.get(i).getText());}
		


driver.quit();

	}

}
