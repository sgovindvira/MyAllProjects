package Package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertlyFile23 {

	public static void main(String[] args) throws IOException {
	
		
		FileInputStream f = new FileInputStream("C:\\QA2022\\Notes\\Notepad\\testProp.properties");
		Properties prop = new Properties();
		prop.load(f);
		
         String browser = prop.getProperty("browser");	
         System.out.println(browser);
		
	
		

 		WebDriver driver = null;
 		
 		
 		if(browser.equals("Firefox")) {	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
 		
 		 driver = new FirefoxDriver();
 		
 		
 		} else if (browser.equals("Chrome")) 
 		
 				{System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");
 			
 			 driver = new ChromeDriver();}
 		
		
		driver.get("https://www.facebook.com/");
		
		

	}

}
