package Package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableUsingProperties {

	public static void main(String[] args) throws IOException {

		FileInputStream f = new 	FileInputStream("C:\\QA2022\\Notes\\Notepad\\testProp.properties");

		Properties p = new Properties();
		p.load(f);

		String browser = p.getProperty("browser");
		System.out.println(browser);


		WebDriver driver= null;

		if(browser.equals("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");

			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get("https://ca.finance.yahoo.com/cryptocurrencies");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='W(100%)']//tr"));
		System.out.println(rows.size());

		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='W(100%)']//tr[1]//td"));
		System.out.println(cols.size());
		
		
		for(int i=1; i<=25; i++) {
			for(int j=1; j<=cols.size(); j++) {
				System.out.println(driver.findElement(By.xpath("//table[@class='W(100%)']//tr["+i+"]//td["+j+"]")).getText());
				System.out.println(" ");
			}
			System.out.println();
		}





	}

}

