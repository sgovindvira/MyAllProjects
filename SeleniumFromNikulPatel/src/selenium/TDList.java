package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");
	
		
		//https://www.td.com/ca/en/personal-banking/
		
			
			//get size for footer links
			//bottom of the screen
		
		Thread.sleep(3000);
		
		List <WebElement> tdlinks = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		
		System.out.println(tdlinks.size());
		
		for(int i= 0; i<tdlinks.size(); i++) {System.out.println(tdlinks.get(i).getText());}
		
		
		
		
		
		
		
		
			
	}

}
