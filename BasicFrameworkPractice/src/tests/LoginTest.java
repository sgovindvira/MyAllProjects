package tests;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	LoginPage lp = new LoginPage();
	Xls_Reader d = new Xls_Reader("C:\\QA2022\\Selenium_Workspace\\BasicFrameworkPractice\\NikulTest.xlsx");
	DataFile df = new DataFile();

	WebDriver driver;


	



	@BeforeMethod
	public void beforeMethod() throws IOException {

		lp.openBrowser();


		lp.openLoginPage();
	}



	@AfterMethod
	public void afterMethod() {

		lp.closeBrowser();

	}

	@Test(priority =1)
	public void loginWithSpecialCharecter() throws InterruptedException {
		lp.login(df.emailWithSpecialCharecter, df.wrongPassword);
		Thread.sleep(2000);


		Assert.assertEquals(lp.readEmailError(), df.SpecialCharecterError);
	}






	@Test(priority =2)
	public void loginWithEmptyEmail() throws InterruptedException {
		lp.login("", df.wrongPassword);

		Thread.sleep(3000);

		Assert.assertEquals(lp.readEmailError(), df.emptyEmailError);


	}




	@Test(priority =3)
	public void loginWithEmptyPassword() throws InterruptedException {
		lp.login(df.wrongEmail, "");
		Thread.sleep(3000);

		Assert.assertEquals(lp.readPassswordError(), df.emptyPasswordError);






	}    

	@Test(priority =4)
	public void loginWithWrongUsenamePassword() throws InterruptedException {
		lp.login(df.wrongEmail, df.wrongPassword);
		Thread.sleep(3000);

		Assert.assertEquals(lp.readGlobalError(), df.globalError);
	}


}
