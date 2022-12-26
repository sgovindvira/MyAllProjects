package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicityWaitTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();


		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// We always put implicity at top. it will only apply webeleements. If web elements is avaible in 1 second then to move another 
		
		
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();


	//	Thread.sleep(3000); This is Java. Only wait for 3 seconds, no matter if element is avaible in0.5 seconds.
		
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sam");
		driver.findElement(By.name("lastname")).sendKeys("bdbvdbvjhjhv");
		driver.findElement(By.name("reg_email__")).sendKeys("6478351404");
		driver.findElement(By.id("password_step_input")).sendKeys("sdgdsfherhrhgreg");


		WebElement month = driver.findElement(By.id("month"));

		Select m =  new Select(month);

		m.selectByValue("1");


		WebElement day = driver.findElement(By.id("day"));

		Select d = new Select(day);

		d.selectByVisibleText("20");



		driver.findElement(By.xpath("//option[@value='2000']")).click();


		driver.findElement(By.xpath("//input[@value='1']")).click();




		driver.findElement(By.name("websubmit")).click();




	
	
	}




}
