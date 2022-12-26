package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		List <WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println("All Links Present on Ebay's HomePage ="+"  "+ links.size());
		
		
		for(int a = 0; a<links.size(); a++) {System.out.println(links.get(a).getText());
		}
		
		
		
		
		
		
		
		
		
	}

}
