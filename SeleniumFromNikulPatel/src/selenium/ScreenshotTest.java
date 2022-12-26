package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();


		driver.get("https://www.facebook.com/");
		//Add commons.io Jar to project

		File screenshot = driver.getScreenshotAs(OutputType.FILE);   // This is for all drivers
		//File srcFile =((TakeScreenshot).driver.getScreenshotAs(OutputType.File); // This is line for WebDriver

		FileUtils.copyFile(screenshot, new  File("C:\\QA2022\\Testing\\screenshot.png"));
		
		
		
		
		

		driver.navigate().to("https://www.amazon.ca/s?k=ama&gclid=EAIaIQobChMI98ecp4n0-gIVvhvUAR2XyAqEEAAYASAAEgKm1fD_BwE&hvadid=231074704717&hvdev=c&hvlocphy=9061009&hvnetw=g&hvqmt=e&hvrand=3221859029853591947&hvtargid=kwd-296458776121&hydadcr=20842_10090776&tag=googcana-20&ref=pd_sl_17tgtilppw_e");

		FileUtils.copyFile(screenshot, new  File("C:\\QA2022\\Testing\\screenshot1.png"));
		
		
		



	}

}
