package Package1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		// classname objectname  = new classname();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(3000);
		
	  String Title	= driver.getTitle();
	  System.out.println("Actual Title=" +Title);
	  
	  String expectedtitle ="Electronics, Cars, Fashion, Collectibles & More | eBay";
	  
	  if(Title.equals(expectedtitle)) {System.out.println("TestPass");}
	  else {System.out.println("TestFail");
	  }
		
		
		
		
		
	}

}
