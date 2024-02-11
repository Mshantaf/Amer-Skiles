package Alert_by_Switch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_by_Switch {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");  
		driver = new ChromeDriver();    // Opening chrome broser    
	    driver.get("https://demoqa.com/alerts");  // Navigate to Website
		driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		WebElement Alert_Button = driver.findElement(By.xpath("//*[@id='alertButton']"));
		Alert_Button.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
