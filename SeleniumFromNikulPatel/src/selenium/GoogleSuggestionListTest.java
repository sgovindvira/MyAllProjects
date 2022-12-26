package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//type Canada
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canada");
		
	//	Thread.sleep(3000);
		
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role='listbox']/li"), 10));

		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='OBMEnb']/ul/li"));
		
	 System.out.println(suggestions.size());
		
	 for(int i=0; i<suggestions.size(); i++) {
			System.out.println(suggestions.get(i).getText());
		}

	
	}

}
