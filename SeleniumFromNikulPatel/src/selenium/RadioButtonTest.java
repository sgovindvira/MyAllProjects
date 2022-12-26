package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		Thread.sleep(3000);
		
		
		List<WebElement> opt = driver.findElements(By.xpath("//input[@name ='group1']"));
		
		
		
		System.out.println(opt.size());
			
			for(int i=0; i<opt.size(); i++) {
				System.out.println(opt.get(i).getAttribute("value")+"--------------------------------------"+opt.get(i).isSelected());}
				
				
				// find the cheese and click
				
			// driver.findElement(By.xpath("//input[@value='Cheese']")).click();
				
				
				//Another method
			 opt.get(2).click();
				
				
				
				
					
				
				for(int i=0; i<opt.size(); i++) {
					System.out.println(opt.get(i).getAttribute("value")+"--------------------------------------"+opt.get(i).isSelected());}
				
				
			}

		

	}


