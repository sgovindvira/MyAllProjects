package selenium;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1290868408%3A1666453367168676&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWpa_W67TlM03IgvugEJFQKxatBDyGN8SRWQn3NtwXhIZHsYISm-o3qU08NjGInChGhBszTt");

		driver.findElement(By.linkText("Help")).click();
		
		Thread.sleep(3000);
		
		//First we need to get the handles for 2nd Window
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow.size());
		
		Iterator<String> itr = allwindow.iterator();
		
		String mainwindow= itr.next();
		String childwindow= itr.next();		
		
		System.out.println(mainwindow);
		
		System.out.println(childwindow);
		
		
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(mainwindow);
		System.out.println(driver.getTitle());
		
	
		driver.close(); //This will close the one window
		
		driver.quit(); // Will close entire browswer
		
	}
	

}
