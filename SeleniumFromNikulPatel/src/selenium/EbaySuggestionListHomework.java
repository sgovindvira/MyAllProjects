package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListHomework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		//iphone suggestion list
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
	driver.get("https://www.ebay.ca/");
	Thread.sleep(5000);
	
	
	driver.findElement(By.id("gh-ac")).click();
	
	driver.findElement(By.id("gh-ac")).sendKeys("Iphone");
	
	Thread.sleep(5000);
	
    List <WebElement> sug	=driver.findElements(By.xpath("//ul[@role='listbox']/li"));

System.out.println(sug.size());

for (int i =0; i<sug.size(); i++) {System.out.println(sug.get(i).getText());}




	
	

	
	
	
	
	
		
		
	}

}
