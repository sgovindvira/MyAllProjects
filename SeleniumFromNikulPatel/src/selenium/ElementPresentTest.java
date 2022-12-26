package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		
		//How to verify if element is present or not
		
		
		
		List<WebElement> about = driver.findElements(By.linkText("About"));
		
		System.out.println(about.size());
		
		if(about.size()>0) {System.out.println("Abput present");}
		
		else	{System.out.println("not present");}
		
		
	}

}
