package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		Thread.sleep(2000);
		
	WebElement fashion=	driver.findElement(By.xpath("//ul[@class='hl-cat-nav__container']/li[3]"));
    WebElement sneak=	driver.findElement(By.linkText("Sneakers"));
	
	Actions act = new Actions(driver);
	act.moveToElement(fashion).moveToElement(sneak).click().perform();
	

	}

}
