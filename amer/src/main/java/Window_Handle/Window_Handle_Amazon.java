package Window_Handle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle_Amazon {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");  
		driver = new ChromeDriver();    // Opening chrome broser    
	    driver.get("https://www.amazon.com/");  // Navigate to Website
		driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	    
		WebElement Best_Seller= driver.findElement(By.xpath("//*[@data-csa-c-content-id=\"nav_cs_bestsellers\"]"));
		Actions ob = new Actions(driver);
		ob.keyDown(Keys.LEFT_CONTROL).build().perform();
		Best_Seller.click();
		ob.keyUp(Keys.LEFT_CONTROL).build().perform();
		Thread.sleep(3000);
		Set <String> window_session=driver.getWindowHandles();
		Iterator <String> itr =window_session.iterator();
		String Win1= itr.next();
		String Win2= itr.next();


		driver.switchTo().window(Win2);
		Thread.sleep(3000);
		
		driver.switchTo().window(Win1);
		Thread.sleep(3000);
		


		

		
		
		
	  
	    driver.quit();
	}

}
