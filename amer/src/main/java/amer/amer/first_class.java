package amer.amer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_class {
public static WebDriver driver ;

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    driver.close();
	
}
	}


