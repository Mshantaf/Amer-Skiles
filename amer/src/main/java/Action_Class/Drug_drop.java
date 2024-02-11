package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drug_drop {
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mshan\\git\\repository6\\2023_batch_bootcamp\\drivers\\chromedriver.exe"); 
		    
    driver = new ChromeDriver();    // Opening chrome broser
		    
    driver.get("https://jqueryui.com/droppable/");  // Navigate to Website
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	 driver.switchTo().frame(0);
	 WebElement draggable= driver.findElement(By.xpath("//*[@id='draggable']"));
	 WebElement droppable= driver.findElement(By.xpath("//*[@id='droppable']"));
	 Actions ob= new Actions(driver);
//	 ob.dragAndDrop(draggable, droppable).build().perform();
	 ob.dragAndDropBy(draggable, 30, 100).build().perform();
	 Thread.sleep(3000);
	 driver.close();
	 
	 
	 
	}

}
