package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		//FirefoxDriver driver = new FirefoxDriver();

             WebDriver driver = new FirefoxDriver();


		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//How many rows in table
		
		int rows = driver.findElements(By.xpath("//table[@id='webtable']/tbody/tr")).size();
		System.out.println("size of row "+rows);
		
		// How many columns are there
		
		int cols = driver.findElements(By.xpath("//table[@id='webtable']/tbody/tr/th")).size();
		System.out.println("Number of columns "  +  cols);
				
		
		
		
		//Retrive the specific column data
		
		//String info= driver.findElement(By.xpath("//table[@id='webtable']//tr[4]/td[1]")).getText();
	//	System.out.println(info);
		
		
		// Retrieve all info from table using loops
		
		for(int r =2; r<rows;r++) {
			
			
			 for (   int c = 1; c<cols; c++ ) { String data = driver.findElement(By.xpath("//table[@id='webtable']//tr["+r+"]/td["+c+"]")).getText();
				 
				 System.out.println(data);
				 
			 }			
			
		}
		
		
		
		
		
	}

}
