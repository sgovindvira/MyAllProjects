package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import tests.Xls_Reader;

public class LoginPage {


	Xls_Reader d = new Xls_Reader("C:\\QA2022\\Testing\\AllJars\\NikulTest.xlsx");

	WebDriver driver;


	//String browser = d.getCellData("Data1", "Browser", 2);

	public void openBrowswer() {

		String browser =    d.getCellData("Data1", "Browser", 2);


		if (browser.equals("Firefox")){

			System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");	
			driver = new FirefoxDriver();
		}

		else if(browser.equals("Chrome")){System.setProperty("webdriver.chrome.driver", "C:\\QA2022\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();}
		PageFactory.initElements(driver, this);

	}


	public void  openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=A8Jslth30lA&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiQThKc2x0aDMwbEEiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2NDgyNjEzMSwiaWF0IjoxNjY0ODI0OTMxLCJqdGkiOiJhMWVmZDc3MS0wN2Y0LTQxZGItYTkxNi04MmU5MDVhOTE1OWYiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.gezW9l8pZUlvsPaxbSBLX4nCyeEDBrdyPvYXyphGEBHx5EVS0Cks57JcyWvy8u5eaQoF15uB_-7X9JkTodPfuH2RgsFev0EXqrpiXu9KFqh3WOdSTDnGozSAwcXTvzH6638EKhy_BdCJJDyg7b6zRJF3ney2SC6IJJ688T6bNHRaoxvSgW3npqbl3XFvyAt7QB73PR-m7tSzcwG1VaWsqlhOhz6T1e5yBNfUXMRMlu2NKy-vzo6-6mBloTbzPysDFLieXiO5WsxJ8ounvoiNjPNBNEGejvsDwRP3vPyBf8tq3ZLL_2GcF4idlJGZfRke2TSLt7uHNGqaFtTqUfQ1Ng&preferred_environment=");
	}

	public void closeBrowser() {
		driver.quit();
	}




	//driver is  null so we cant use webelement here



	/* WebElement email = driver.findElement(By.id("usernameInput-input"));
	 WebElement password =driver.findElement(By.name("password"));
	 WebElement loginbutton = driver.findElement(By.id("signIn"));
	 WebElement emailErro = driver.findElement(By.id("UsernameTextField__errors-usernameInput"));
	 WebElement passwordError = driver.findElement(By.id("PasswordTextField__errors-password"));
	 WebElement globalError1 = driver.findElement(By.id("globalError"));
	 */





	@FindBy(id = "usernameInput-input")
	public WebElement email;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(id = "signIn")
	public WebElement signIn;

	@FindBy(id = "globalError")
	public WebElement globalErr;

	@FindBy(id = "UsernameTextField__errors-usernameInput")
	public WebElement emailErr;

	@FindBy(id = "PasswordTextField__errors-password")
	public WebElement passwordErr;


	// number 1
	public void login(String a, String b) throws InterruptedException {
		email.sendKeys(a);	
		password.sendKeys(b);
		signIn.click();
		//driver.findElement(By.name("password")).sendKeys(Keys.ENTER);


		Thread.sleep(3000);


	}

	public String readEmailError() {
		String expected = "Please enter a username or card number without special characters.";
		String actual = email.getText();





		return actual;

	}

	public String readPasswordError() {
		String expected = "Please enter your password.";
		String actual = password.getText();


		return actual;

	}

	public String globalError() {
		String expected = "Please check your card number / username or password and try again.";
		String actual = globalErr.getText();




		return actual;}





}
