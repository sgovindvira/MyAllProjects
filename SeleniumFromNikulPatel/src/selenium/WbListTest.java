package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WbListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.tagName("a")); // It will give first tag A fronm HTML
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a")); //  This will give us all the link present in webpage		
		
		
		
		System.out.println(allLinks.size());
		
		for(int i =0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());}
			
			
			
			
			
			// how to find links only from certain area
			//example : Footer
			
			
			WebElement Footer =driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
			
			List <WebElement> LinksFromFooter = Footer.findElements(By.tagName("a"));
			
			System.out.println(LinksFromFooter.size());
			
			for (int f = 0; f<LinksFromFooter.size(); f++) {System.out.println(LinksFromFooter.get(f).getText());}
			
			
			
			
			
			
			
			
			
			//Another method of finding links from certain area
			
			//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
			//List<WebElement> allLink = footer.findElements(By.tagName("a"));
			
			List<WebElement> allLink = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
			System.out.println(allLink.size());
			
			for(int i=0; i<allLink.size(); i++) {
			System.out.println(allLink.get(i).getText());}

			
			
			
			
			
			
			
			
			
			
			
		}

		
		
	}

