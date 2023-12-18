package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Enter_key_Actions {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
	    
	    driver = new ChromeDriver();    // Opening chrome broser
			    
	    driver.get("https://www.amazon.com/");  // Navigate to Website
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement search =driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		search.sendKeys("laptop");
		
		Actions ob = new Actions(driver);
//		ob.sendKeys(Keys.ARROW_DOWN).build().perform();
//        ob.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).build().perform();

//		Thread.sleep(7000);
		ob.sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(3000);

		ob.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);



		
		
		
		
		driver.close();
		
		
		
	}

}
