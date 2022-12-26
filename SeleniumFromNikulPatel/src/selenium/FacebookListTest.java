package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Get the links from facebook from footer
		//no language 
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		

		
		
		
		
		List<WebElement> Links = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		
	System.out.println(Links.size());
		
		for(int i=0; i<Links.size(); i++) {
			System.out.println(Links.get(i).getText());
		}

		
		driver.quit();
		
		
		
		

	}

}
