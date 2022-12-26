package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownUsingMultipleBrowser {

	public static void main(String[] args) throws InterruptedException {


		Xls_Reader e = new Xls_Reader("C:\\QA2022\\Testing\\XML\\NikulTest.xlsx");
		String browser = e.getCellData("Data1", "Browser", 2);
		System.out.println(e.getCellData("Data1", "Browser", 2));


		WebDriver driver = null;

		if(browser.equals("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();}

		else  {System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();}
		
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement  list = driver.findElement(By.xpath("//div[@rel-title='Select Country']//p/select"));
		
		
		Select s = new Select(list);
		
		s.selectByIndex(20);// Berus
		
		Thread.sleep(2000);
		
		s.selectByValue("CAN"); //Canada
		
		Thread.sleep(2000);
		s.selectByVisibleText("India");
		
	//Trying to get the all countries name
		
		List <WebElement> AllCountries = driver.findElements(By.xpath("//div[@rel-title='Select Country']//p/select/option"));
		System.out.println(AllCountries.size());
		
		for (int i =0; i<AllCountries.size(); i++)
		{System.out.println(AllCountries.get(i).getText());}
		
		// Success 
		





}

}
