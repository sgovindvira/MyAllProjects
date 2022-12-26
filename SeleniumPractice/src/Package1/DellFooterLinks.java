package Package1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DellFooterLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.dell.com/en-ca");

		Thread.sleep(2000);

		List <WebElement> footer = driver.findElements(By.xpath("//nav[@class='ft-contextual-links-section']//a"));

		System.out.println(footer.size());



		for(int i=0; i<footer.size(); i++) {System.out.println(footer.get(i).getText());}

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		//Copy the file to a location and use try catch block to handle exception
		try {
			FileUtils.copyFile(screenshot, new File("C:\\QA2022\\Notes\\Notepad\\homePageScreenshot.png"));


		 } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
	      
	        driver.close();
		}

	}
