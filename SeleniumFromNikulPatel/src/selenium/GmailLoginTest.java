package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		String browser ="Chrome";
		
		
		
		WebDriver driver = null;
		
		if(browser.equals("Firefox")) {
		
		
		 	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		 driver = new FirefoxDriver();}
		
		
		else if (browser.equals("Chrome"))
		
		

				{System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");
			
			 driver = new ChromeDriver();}
		
		
		
		
		
		
		
		
		
		
		
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-988965935%3A1665241474255792&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWraapeG7jruMYYVgy4Il6UAP3w7mizoLwo2TsPYruOJguWbIszp9yAAx6HKvwjU6Wki8xkd");
		
	
		 driver.findElement(By.id("identifierId")).sendKeys("fjkwbjrbkjgjkfbgkjrhihjfjfjfjff");
		 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 
		 		Thread.sleep(3000);
	

		 
		 String expectedError = "Couldn’t find your Google Account"
		 		+ "";
		 String actualError = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(expectedError);
		System.out.println(actualError);
		
		
		if (expectedError.equals(actualError)){System.out.println("Test Pass");}
		else {System.out.println("TestFail");}
		
		
		 
	}

}
