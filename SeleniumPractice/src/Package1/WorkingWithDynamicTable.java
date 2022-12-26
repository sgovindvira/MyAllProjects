package Package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithDynamicTable {

	public static void main(String[] args) {
		Xls_Reader d = new 	Xls_Reader("C:\\QA2022\\Testing\\XML\\NikulTest.xlsx");

		String browser = d.getCellData("Data1", "Browser", 2);



		WebDriver driver = null;


		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");


			driver = new FirefoxDriver();		
		}


		else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");


			driver = new ChromeDriver();
		}


		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement>	rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(cols.size());
		
		for (int i = 2; i<=rows.size(); i++ ) {
			for (int j=1; j<=cols.size(); j++) {
				System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
			}System.out.println("  ");
		}System.out.println();
		










	}

}
