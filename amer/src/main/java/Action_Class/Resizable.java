package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
	    
	    driver = new ChromeDriver();    // Opening chrome broser
			    
	    driver.get("https://jqueryui.com/resizable/");  // Navigate to Website
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		 driver.switchTo().frame(0);
		 WebElement Resizble= driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		 Actions ob= new Actions(driver);
         ob.dragAndDropBy(Resizble, 200, 10).build().perform();
		 Thread.sleep(3000);
		 driver.close();
	}

}
