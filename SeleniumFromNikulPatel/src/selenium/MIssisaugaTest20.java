package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MIssisaugaTest20 {

	public static void main(String[] args) {
		
		
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {System.out.println(list.get(i).getText());}
		
	}

}
