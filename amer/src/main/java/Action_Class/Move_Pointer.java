package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_Pointer {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
	    
	    driver = new ChromeDriver();    // Opening chrome broser
	    
	    driver.get("https://www.amazon.com/");  // Navigate to Website
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    Actions ob = new Actions (driver);
	    
	   WebElement hello_sign_list= driver.findElement(By.xpath("//*[@class='nav-a nav-a-2   nav-progressive-attribute']"));
	   ob.moveToElement(hello_sign_list).build().perform();
	   Thread.sleep(5000);
	   WebElement creat_list= driver.findElement(By.xpath("(//*[@class=\"nav-text\"])[1]"));
	   creat_list.click();
//       ob.moveToElement(creat_list).build().perform();	   
	    
	    


//	    Actions ob = new Actions (driver);
//	    
//	    WebElement amazon_signin = driver.findElement(By.xpath("(//*[text()='Hello, sign in'])[1]"));
//	    ob.moveToElement(amazon_signin).build().perform();
	    
	    Thread.sleep(5000);
	    
	    driver.close();

	}

}
