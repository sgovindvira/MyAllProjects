package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.ebay.ca/");
	
		
		List<WebElement> links = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		System.out.println(links.size());
		
		
		//for (int i=0; i<links.size(); i++) {System.out.println(links.get(i).getText()+"---------------------------------------"+ links.get(i).isSelected());}//Is selected for is to see if whic one is selected by default
		

		
		
		// How t select dropdown options
		
		
		
		WebElement  box = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select(box);
		
		
		s.selectByIndex(1); // Select Antiques
		
		//2nd Method
		
		Thread.sleep(3000);
		
		s.selectByValue("2984"); // it will select baby. Index number we get from HTML
		
		
		//3rd method
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("Books");
		
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Dolls & Bears");
		
		
	
		for (int i=0; i<links.size(); i++) {System.out.println(links.get(i).getText()+"---------------------------------------"+ links.get(i).isSelected());}//Is selected for is to see if whic one is selected by default
		
System.out.println("----------------------------------------------------------------");




System.out.println(s.getFirstSelectedOption().getText());



















		
	}

}
