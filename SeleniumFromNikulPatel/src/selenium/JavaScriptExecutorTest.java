package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");

		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.adidas.ca/en");
		
		

		/*	Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='gl-flex-display gl-flex-row gl-flex-justify-content-center']//button[@type='button']//span[@class='gl-icon__wrapper']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://careers.adidas-group.com/']")).click();
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// We need to scroll down using java execute script
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		WebElement c = driver.findElement(By.linkText("Careers"));





/* Option 1
		
		System.out.println(c.getLocation());

		jse.executeScript("window.scrollBy(0,5000)");
		c.click();


	*/
		
		
		
		// Option 2 Scroll until the element is in the view
		
		//jse.executeScript("arguments[0].scrollIntoView(true);",c);
		//c.click();
		
		
		
		
		
		
		
		
		//Option 3 Direct click
		
		jse.executeScript("arguments[0].click();", c);
		

	}

}
