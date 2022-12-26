package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		
		
		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		
        System.out.println("Current location of slider  "+ min_slider.getLocation());
		System.out.println("Dimension of element " + min_slider.getSize());// no need to use. jst fyi
		
		
		Actions act= new Actions(driver);
		
		act.dragAndDropBy(min_slider, 200, 0).perform();
		
		
		
		
		 System.out.println("Current location of slider  "+ min_slider.getLocation());
			System.out.println("Dimension of element " + min_slider.getSize());
	
			
			
			
			
			
			
			
			// Right slider
			
			
			WebElement right = driver.findElement(By.xpath("//span[2]"));
			act.dragAndDropBy(right, -100, 0).perform();

			
			
			 System.out.println("Maximum location of slider  "+ right.getLocation());
				System.out.println("Maximum of element " + right.getSize());
			
			
			
			
			
			
			
	}

}
