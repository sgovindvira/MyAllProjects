package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");

		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(		"https://jqueryui.com/droppable/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));



		
		driver.switchTo().frame(0);

		WebElement draggable =	driver.findElement(By.id("draggable"));
		WebElement dropable = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, dropable).build().perform();
		
		
		wait.until(ExpectedConditions.textToBePresentInElement(dropable, "Dropped"));
		System.out.println(dropable.getText());
		
		if(dropable.getText().equals("Dropped!")) {System.out.println("Test Pass");
				} else {System.out.println("TestFail");}
		
		



	}

}
