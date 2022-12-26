package Package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.td.com/ca/en/personal-banking/");
		
		
		Thread.sleep(3000);
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\\\QA2022\\\\Testing\\\\screenshot2.png"));
	

		
		
		
	}
	
}
