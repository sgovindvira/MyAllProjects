package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWaitTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		//****************Confirm box
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//This will apply all webelements
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));// This applies to certain conditions
		
		
		
		

		driver.get("https://echoecho.com/javascript4.htm");
		driver.findElement(By.name("B2")).click();

	//	Thread.sleep(1000);
		
		
		wait.until(ExpectedConditions.alertIsPresent()); // Specifying to this conditions only 
		Alert at = driver.switchTo().alert();

		System.out.println(at.getText());

		at.accept();
		//	at.dismiss();
		
		
		
		driver.findElement(By.name("B1")).click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert at1 = driver.switchTo().alert();

		System.out.println(at1.getText());

		at1.accept();
		//	at.dismiss();
		
		
		
		
		
		
		//**********************************prompt box****************************

		driver.findElement(By.name("B3")).click();

		//Thread.sleep(1000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert at11 = driver.switchTo().alert();
		at.sendKeys("Hello");

		//Thread.sleep(2000);

		System.out.println(at11.getText());

		at11.accept();
		//	at.dismiss();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
