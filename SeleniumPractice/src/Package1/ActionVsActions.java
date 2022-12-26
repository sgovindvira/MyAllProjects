package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.ebay.ca/");
		
		
	WebElement fashion	= driver.findElement(By.xpath("//div[@class='hl-cat-nav']/ul/li[3]"));
				
	Actions act = new Actions(driver);
	//act.moveToElement(fashion).perform();
		
		
		
		
		// Action = it will store and we can use later.
		

		
		
		Action abc = act.moveToElement(fashion).build();
		abc.perform();
		
		
		
		
		

	}

}
