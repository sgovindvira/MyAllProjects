package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiabankLoginTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=A8Jslth30lA&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiQThKc2x0aDMwbEEiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2NDgyNjEzMSwiaWF0IjoxNjY0ODI0OTMxLCJqdGkiOiJhMWVmZDc3MS0wN2Y0LTQxZGItYTkxNi04MmU5MDVhOTE1OWYiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.gezW9l8pZUlvsPaxbSBLX4nCyeEDBrdyPvYXyphGEBHx5EVS0Cks57JcyWvy8u5eaQoF15uB_-7X9JkTodPfuH2RgsFev0EXqrpiXu9KFqh3WOdSTDnGozSAwcXTvzH6638EKhy_BdCJJDyg7b6zRJF3ney2SC6IJJ688T6bNHRaoxvSgW3npqbl3XFvyAt7QB73PR-m7tSzcwG1VaWsqlhOhz6T1e5yBNfUXMRMlu2NKy-vzo6-6mBloTbzPysDFLieXiO5WsxJ8ounvoiNjPNBNEGejvsDwRP3vPyBf8tq3ZLL_2GcF4idlJGZfRke2TSLt7uHNGqaFtTqUfQ1Ng&preferred_environment=");
		
		
		
		
	driver.findElement(By.name("usernameInput")).sendKeys("gdkbgkjklkerjgioergyghuighrjkfnkjnkjr#@$");	
	driver.findElement(By.name("password")).sendKeys("fkjdksdjfnkjd" + Keys.ENTER);
	//driver.findElement(By.id("signIn")).click();
	//driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	
	
	Thread.sleep(3000);
	
	
	
	String expected = "Please enter a username or card number without special characters.";
	String actual = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
	
	
	
	System.out.println(expected);
	System.out.println(actual);
	
	
	
	if (expected.equals(actual)) {System.out.println("Test Pass");}
	
	else {System.out.println("Test Fail");}
	
	
	
		
	
	
	 
		
		
		
		
		
		
		
		
		
	}
		
		
	}
	


