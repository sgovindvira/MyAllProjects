package selenium;

//Not working

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
	
	
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("	https://www.alibaba.com/");
	
		
	
		
		driver.findElement(By.name("SearchText")).sendKeys("Computer");
		
		Thread.sleep(1000);
		
		Alert at =  driver.switchTo().alert();
		at.accept();
		System.out.println(at.getText());
		
		
		
		
		
		
		
		
		
	/*	alibaba test
		
		if you get the po > close pop > type computer in search bat
		if no pop then directyl  search computer in 
*/
	}

}
