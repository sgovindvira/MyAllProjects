package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://yahoo.com/");
		Thread.sleep(3000);
		
  List<WebElement> trending = driver.findElements(By.xpath("//div[@class='c-list-row D(ib) W(50%)']/div/a"));
  
  
  System.out.println(trending.size());
		
  
  
  
  System.out.println(trending.get(3).getText());
  
  
  for (int i=0; i<trending.size(); i++)
  {System.out.println(trending.get(i).getText());  }
  
  
		
		//Trending links
		//Text and Links
		
		
	}

}
