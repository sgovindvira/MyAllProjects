package tests;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	Xls_Reader d = new Xls_Reader("C:\\QA2022\\Testing\\AllJars\\NikulTest.xlsx");



	
	

	
	LoginPage lp = new LoginPage();
	DataFile df = new DataFile();

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		lp.openBrowswer();
		lp.openLoginPage();


	}



	@Test(priority =1)


	public void loginwithspecialCharecter() throws InterruptedException 

	{	
		lp.login(df.emailwithSpecialChar, df.WrongPass);
		Assert.assertEquals(lp.readEmailError(), df.specialCharErr);

System.out.println(lp.readEmailError());



	}

	//@Test(priority =2)
	public void loginwithEmpty() throws InterruptedException {

		lp.login("", df.WrongPass);
		Assert.assertEquals(lp.readEmailError(), df.emptyEmailErr);


	}







//@Test(priority =3)
	public void loginwithEmptypassword() throws InterruptedException {

		lp.login(df.wrongEmail, "");
		Assert.assertEquals( lp.readPasswordError(), df.emptyPassErr);


	}

	//@Test(priority =4)
	public void loginwithwrongandpassword() throws InterruptedException {
		lp.login(df.wrongEmail, df.WrongPass);
		Assert.assertEquals(lp.globalError(), df.globalErrpr);}




	@AfterMethod
	public void afterMethod() {
		lp.closeBrowser();
	}

}
