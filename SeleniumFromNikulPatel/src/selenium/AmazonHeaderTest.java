package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.ca/");
		
		
		
		Thread.sleep(3000);
		
		
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		
		System.out.println(links.size());
		
		
		for (int i = 0; i<links.size(); i++) {System.out.println(links.get(i).getText());
		}
		

	}

}
