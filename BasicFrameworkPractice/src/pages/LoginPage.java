package pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.tools.FileObject;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class LoginPage {
	WebDriver driver;

	@FindBy(name ="usernameInput")
	public WebElement email;

	@FindBy(name ="password")
	public WebElement password;


	@FindBy(id ="signIn")
	public WebElement sigIn;

	@FindBy(id ="UsernameTextField__errors-usernameInput")
	public WebElement ActualEmailError;

	@FindBy(id ="PasswordTextField__errors-password")
	public WebElement actualPasswordError;

	@FindBy(id ="globalError")
	public WebElement actualGlobalError;






	public void openBrowser() throws IOException {
		FileInputStream a = new FileInputStream("C:\\QA2022\\Selenium_Workspace\\BasicFrameworkPractice\\BrowserPropertyFile.properties");
		Properties prop = new Properties();
		prop.load(a);
		String s = prop.getProperty("browser");


		if(s.equals("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");	
			driver = new FirefoxDriver();}


		else if(s.equals("Chrome"))
		{System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");

		driver = new ChromeDriver();
		}

		PageFactory.initElements(driver, this);

	}






	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=A8Jslth30lA&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiQThKc2x0aDMwbEEiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2NDgyNjEzMSwiaWF0IjoxNjY0ODI0OTMxLCJqdGkiOiJhMWVmZDc3MS0wN2Y0LTQxZGItYTkxNi04MmU5MDVhOTE1OWYiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.gezW9l8pZUlvsPaxbSBLX4nCyeEDBrdyPvYXyphGEBHx5EVS0Cks57JcyWvy8u5eaQoF15uB_-7X9JkTodPfuH2RgsFev0EXqrpiXu9KFqh3WOdSTDnGozSAwcXTvzH6638EKhy_BdCJJDyg7b6zRJF3ney2SC6IJJ688T6bNHRaoxvSgW3npqbl3XFvyAt7QB73PR-m7tSzcwG1VaWsqlhOhz6T1e5yBNfUXMRMlu2NKy-vzo6-6mBloTbzPysDFLieXiO5WsxJ8ounvoiNjPNBNEGejvsDwRP3vPyBf8tq3ZLL_2GcF4idlJGZfRke2TSLt7uHNGqaFtTqUfQ1Ng&preferred_environment=");

	}

	public void closeBrowser() {
		driver.quit();
	}

	public void login(String a, String b) {
		email.sendKeys(a);	
		password.sendKeys(b);
		sigIn.click();

	}

	public String readEmailError() {		
		String actual = ActualEmailError.getText();
		System.out.println(actual);
		return actual;
	}


	public String readPassswordError() {
		String actual =actualPasswordError.getText();
		System.out.println(actual);
		return actual;



	}

	public String readGlobalError(){
		String actual = actualGlobalError.getText();
		System.out.println(actual);
		return actual;

	}
}
