/*package StepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsForTableFeatureFile {

	WebDriver driver;
	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com");




	}

	@When("^Title of login page is Swag Labs$")
	public void title_of_login_page_is() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);

	}


	@Then("^user enters username and password $")
	public void user_enters_username_password(DataTable creds)  {
		List<List<String>> data = creds.raw();
		driver.findElement(By.id("user-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));


	}

	@Then ("^User clicks on Login button$")
	public void abc() {

		driver.findElement(By.id("login-button")).click();

	}
	@Then("^user can see cart icon$")
	public void xyz(){
		boolean cart =	driver.findElement(By.id("shopping_cart_container")).isDisplayed();
		System.out.println(cart);
	}

	@Then("^click on add to cart on Sauce Lab Backpack.$")
	public void click_on_add_to_cart_on_Sauce_Lab_Backpack() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}

	@Then("^click on Cart icon$")
	public void click_on_Cart_icon() {
		driver.findElement(By.id("shopping_cart_container")).click();
	}

	@Then("^click on Checkout$")
	public void click_on_Checkout() {
		driver.findElement(By.id("checkout")).click();
	}

	@Then("^Enter  shipping details$")
	public void enter_shipping_details() {
		driver.findElement(By.id("first-name")).sendKeys("Selenium");
		driver.findElement(By.id("last-name")).sendKeys("Automation");
		driver.findElement(By.id("postal-code")).sendKeys("123456");

	}

	@Then("^click on continue$")
	public void click_on_continue() {
		driver.findElement(By.id("continue")).click();
	}



	@Then("^click on Finnish$")
	public void click_on_Finnish() {
		driver.findElement(By.id("finish")).click();
	}

	@Then("^Verify Thank you for purchase message$")
	public void verify_Thank_you_for_purchase_message() {
		boolean msg =	driver.findElement(By.xpath("//h2[@class='complete-header']")).isDisplayed();
		System.out.println("Is success message visible?" + " = "  + msg);
	}
	@Then ("^close the browser$")
	public void closebrowser () {
		driver.quit();
	}








}


*/
