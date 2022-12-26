package selenium;



import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AliBabaPopTest {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.alibaba.com/");
		Thread.sleep(3000);
		
		List<WebElement> pop1 = driver.findElements(By.className("_24EHh"));
		System.out.println(pop1);
		if(pop1.size()>0) {
			pop1.get(0).click();
		}
		
		driver.findElement(By.name("SearchText")).sendKeys("Computer");
		

		
		

	}

}
