package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		Thread.sleep(3000);

		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(electronics).perform();
		
		Thread.sleep(3000);
		//Getting the size of Electronics
		List<WebElement> list = driver.findElements(By.xpath("(//nav [@aria-label='Top Categories']/ul)[3]/li"));
		
		System.out.println(list.size());
		
		
		for(int i =0; i<list.size(); i++) {System.out.println(list.get(i).getText());}
		
		

	}

}
