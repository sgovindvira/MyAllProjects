package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyTestHomework {

	public static void main(String[] args) {

		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		
		
		
		//Deals > size and text for this  link
		
		driver.get("https://www.bestbuy.ca/en-ca");
		
		driver.findElement(By.xpath("//span[@data-automation='x-deals']")).click();
		
		
		List<WebElement> links =driver.findElements(By.xpath("//li[@data-automation='deals']//a"));
		System.out.println(links.size());
		
		for(int i =0; i<links.size();i++) {System.out.println(links.get(i).getText());}
		 
	}

}
