package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class press_2_Keys_togther {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
		    
		    driver = new ChromeDriver();    // Opening chrome broser
				    
		    driver.get("https://www.amazon.com/");  // Navigate to Website
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
			WebElement search =driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
			search.sendKeys("laptop");
			Thread.sleep(3000);

			Actions ob = new Actions(driver);
			ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			ob.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
			search.click();
			Thread.sleep(1000);
			ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			ob.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(3000);


			
            driver.close();

			
			
	}

}
