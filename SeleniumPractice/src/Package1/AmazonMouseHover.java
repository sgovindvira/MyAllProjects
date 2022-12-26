package Package1;import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		
	WebElement signin =	driver.findElement(By.id("nav-link-accountList"));
		Actions act = new Actions(driver);
		act.moveToElement(signin).perform();


List<WebElement> links = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
Thread.sleep(2000);

//for(int  i=0; i<links.size(); i++ ) {System.out.println(links.get(i).getText());}
		
// Another method to get all text

for(WebElement a : links) {System.out.println(a.getText());}
		
		
	}

}
