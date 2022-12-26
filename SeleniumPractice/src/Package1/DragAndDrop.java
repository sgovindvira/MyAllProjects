package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	WebElement source = driver.findElement(By.id("box6"));
	WebElement target = driver.findElement(By.id("box106"));
	
	Actions act = new Actions(driver);
	
	act.dragAndDrop(source, target).perform();
		
		
		
		
	}

}
