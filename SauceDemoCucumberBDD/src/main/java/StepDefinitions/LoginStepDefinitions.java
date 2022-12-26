 package StepDefinitions;
 

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	
	//@Before
	//@After > Import from cucumber > same concecept as TestNG

	
	
	@Before
	public void setup(){
		System.out.println("Before method");
	}
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
		//openBrowserandURL();
		
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


	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_password(String username, String Password)  {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(Password);



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
	
	
	@After
	public void teardown() {
		System.out.println("Teardown");
	}
	
	

}


