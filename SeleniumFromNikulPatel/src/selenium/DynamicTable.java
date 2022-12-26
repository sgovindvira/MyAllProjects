package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		
	
	
			System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
				
				FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				Thread.sleep(2000);
				
				
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size()+" ROW SIZE");
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"))	;	
				System.out.println(cols.size()+" colums");
				
				
				for (int i= 2; i<=rows.size(); i++) {
					
					for (int j =1; j<=cols.size(); j++) {
						// String s= "//table[@id='customers']//tr["+i+"]/td["+j+"]";
						// System.out.println(s);
						
						System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
						System.out.println("  ");
						 
					}
						
						System.out.println();
						
				}
				
				

				
	
} 
	}

