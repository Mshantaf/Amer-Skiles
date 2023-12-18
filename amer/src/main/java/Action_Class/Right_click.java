package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
	    
	    driver = new ChromeDriver();    // Opening chrome broser
			    
	    driver.get("https://deluxe-menu.com/popup-mode-sample.html");  // Navigate to Website
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Right_click=driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
		Actions ob = new Actions(driver);
		ob.contextClick(Right_click).build().perform();   // use contexClick to right click any element
		Thread.sleep(5000);

	
		driver.close();
	}

}
