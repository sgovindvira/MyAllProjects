package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
		
		
		// Header Links
		// saved fashison sneaker motors etc
		
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.ebay.ca/");
		

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		
		System.out.println(list.size());
		

		
		for(int i = 0; i <list.size(); i++) {System.out.println(list.get(i).getText());}
		
		
		driver.quit();
		
		
		
	}

}
