package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFromXLS {
	
	

	public static void main(String[] args) {
		Xls_Reader d = new Xls_Reader("C:\\QA2022\\Testing\\XML\\NikulTest.xlsx");
		
		
		
		
		
		String browser = d.getCellData("Data1", "Browser", 2);
		

		WebDriver driver = null;
		
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
			
	
	      driver = new FirefoxDriver();
			
			
			
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");
			

			 driver = new ChromeDriver();
		}
		
		
		driver.get("https://www.facebook.com/");
	

	}

}
