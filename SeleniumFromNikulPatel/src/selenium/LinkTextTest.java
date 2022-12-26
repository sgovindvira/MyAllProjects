package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {
	
	
	
	public static void main(String[]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		
		
		
		
		driver.get("https://google.com/");
	//	driver.findElement(By.linkText("About")).click();		
		
		driver.findElement(By.partialLinkText("Abo")).click();
		
		
		Thread.sleep(3000);
		
		
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String ActualTitle = driver.getTitle();
		
		System.out.println(expectedTitle);
		System.out.println(ActualTitle);
		
		
		if (expectedTitle.equals(ActualTitle)) {System.out.println("Passed");}
		else { System.out.println("Test Failed");}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
