package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionHomework {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		//get size and Text
		
		
		// TODO Auto-generated method stub

		
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://yahoo.com/");
		
		
		
		driver.findElement(By.id("ybar-sbq")).sendKeys("Iphone");
		
		Thread.sleep(3000);
		
		
		List<WebElement> sugg = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(sugg.size());
		
		for (int i = 0; i<sugg.size(); i++) {System.out.println(sugg.get(i).getText());
		
		}
		
		
		
		
		
		
		
		
		
	}

}
