package Package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Durations;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
		
		
		
		String year ="2023";
		String month = "July";
		String day ="1";
		
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click(); //Opens the date picker
		
		while(true)
		{
		String monthyear=	driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	String arr[]=	monthyear.split(" ");
	String mon = arr[0];
	String yr = arr[1];
	
	if(mon.equalsIgnoreCase(month) && yr.equals(year))
		break;
	else
		driver.findElement(By.xpath("//button[contains(text(),'>')]")).click();

		}
		
	//Date pick now
		List <WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		
		//video 22// duration 14:12

	}

}
