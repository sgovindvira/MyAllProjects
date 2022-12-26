package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
	List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
	
	if(sortable.size()>0) {System.out.println("Sortable is present");} 
	else {System.out.println(" Not present ");}
		
	//Iframe
	
	
	List <WebElement> draggable = driver.findElements(By.id("draggable"));
	
	if(draggable.size()>0) {System.out.println("Draggable is present");}
	else
	{System.out.println("Not present");} // There is i fram so thats why Dragable not present
	
		
//******************************************************************************************************************************************
	System.out.println("**************Switching to oframe*******************");
	
List<WebElement> sortable1 = driver.findElements(By.linkText("Sortable"));
	
	if(sortable1.size()>0) {System.out.println("Sortable is present");} 
	else {System.out.println(" Not present ");}
		
	driver.switchTo().frame(0); // now both element should be present as we are switching to frame
	
	
	List <WebElement> draggable1 = driver.findElements(By.id("draggable"));
	
	if(draggable1.size()>0) {System.out.println("Draggable is present");}
	else
	{System.out.println("Not present");}
		
		
		
	
	
	System.out.println("*******************************************************************************Switching bank to main frame now");

	driver.switchTo().defaultContent();
	
	
List<WebElement> sortable11 = driver.findElements(By.linkText("Sortable"));
	
	if(sortable11.size()>0) {System.out.println("Sortable is present");} 
	else {System.out.println(" Not present ");}
		
	//Iframe
	
	
	List <WebElement> draggable11 = driver.findElements(By.id("draggable"));
	
	if(draggable11.size()>0) {System.out.println("Draggable is present");}
	else
	{System.out.println("Not present");}
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
