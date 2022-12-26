package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		
		
		
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		
		
		
		//How to find number of rows in Table
		//This methods gives rows /columns everything
		
/*	List<WebElement> rows = driver.findElements(By.xpath("//tbody[@style='box-sizing: inherit;']/tr"));
		System.out.println(rows.size());
		
		for (int i =0; i<rows.size(); i++) {System.out.println(rows.get(i).getText())+;}                     */
		
		
		//Method 2
		
		int rows  = driver.findElements(By.xpath("//tbody[@style='box-sizing: inherit;']/tr")).size();
		System.out.println("Total rows =" + rows +"           ");
		
		
		
		
		
		
		//2. How to find columus from table
		
		
		int cols = driver.findElements(By.xpath("//tr[@style='box-sizing: inherit;']/th")).size();
		System.out.println("Total columns  =" + cols);
		
		
		
		
		
		
		
		// Retrive specific data from table
		//We just have to specify xpath
		
		String value = driver.findElement(By.xpath("//tbody[@style='box-sizing: inherit;']/tr[1]/th[1]")).getText();
		System.out.println("The Value is " +value);
		
		
		// Retrive all data from Table
		
		
	for (int r = 1; r<=rows; r++)	{
		
			
			
		for (int c =1; c<=cols; c++) {
			
			String alldata= driver.findElement(By.xpath("//tbody[@style='box-sizing: inherit;']/tr["+r+"]/th["+c+"]")).getText();
			
			System.out.println(alldata);
			
		}	
			
		System.out.println();
			
		}
		
		

	}

}
