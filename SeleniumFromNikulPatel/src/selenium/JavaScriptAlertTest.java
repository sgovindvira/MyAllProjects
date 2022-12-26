package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {






		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
//****************Confirm box
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://echoecho.com/javascript4.htm");
		driver.findElement(By.name("B2")).click();

		Thread.sleep(1000);
		Alert at = driver.switchTo().alert();

		System.out.println(at.getText());

		at.accept();
		//	at.dismiss();



// ******************************* Alertbox**************************

		driver.findElement(By.name("B1")).click();

		Thread.sleep(1000);
		Alert at1 = driver.switchTo().alert();

		System.out.println(at1.getText());

		at1.accept();
		//	at.dismiss();
		
		
		
		
		
		
		//**********************************prompt box****************************

		driver.findElement(By.name("B3")).click();

		Thread.sleep(1000);
		Alert at11 = driver.switchTo().alert();
		at.sendKeys("Hello");

		Thread.sleep(2000);

		System.out.println(at11.getText());

		at11.accept();
		//	at.dismiss();


	}

}
