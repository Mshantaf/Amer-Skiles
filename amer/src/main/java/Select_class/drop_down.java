package Select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
		   
	    driver = new ChromeDriver();    // Opening chrome broser
	    
	    driver.get("https://www.facebook.com/");  // Navigate to Website
	    driver.manage().window().maximize();
		Thread.sleep(1000);
		

	    
	  WebElement createAccount =   driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
	  createAccount.click();
	  Thread.sleep(1000);

	  
	  WebElement birthday_month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
	  
	  Select ob = new Select(birthday_month);
	  ob.selectByVisibleText("Dec");
	  Thread.sleep(1000);
	
	    
	    driver.close();

		
		
		
		
		
		
	}

}
