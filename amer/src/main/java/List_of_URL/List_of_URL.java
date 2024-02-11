package List_of_URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class List_of_URL {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");  
		driver = new ChromeDriver();    // Opening chrome broser    
	    driver.get("https://www.facebook.com/");  // Navigate to Website
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total tags = "+links.size());
		int i;
		for ( i=0;i<links.size();i++) {
		System.out.println(links.get(i).getAttribute("href"));

		}
		System.out.println("Total links = "+i);	


		driver.close();
	}
	
}



