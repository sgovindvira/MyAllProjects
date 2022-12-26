package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeMouseHoverTest17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Men > shoe// text for second column
		
		
		
		
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		
		//
		
		//Deals > size and text for this  link
		
		driver.get("https://www.nike.com/ca/a");
		
		WebElement men =driver.findElement(By.linkText("Men"));
		Actions act =new Actions(driver);
		act.moveToElement(men).perform();
		
		
		List<WebElement> links =driver.findElements(By.xpath("//div[@id='DesktopMenu-0-1-0']/div[1]/div[2]/a"));
		System.out.println(links.size());
		
		//for(int i =0; i<links.size();i++) {System.out.println(links.get(i).getText());}
		
		for(WebElement s :links) {
			System.out.println(s.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
