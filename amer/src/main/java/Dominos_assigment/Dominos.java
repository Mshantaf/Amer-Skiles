package Dominos_assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dominos {
	public static WebDriver driver;

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mshan\\git\\repository6\\2023_batch_bootcamp\\drivers\\chromedriver.exe");  
	driver = new ChromeDriver();    // Opening chrome broser    
    driver.get("https://www.dominos.com/");  // Navigate to Website
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

//	Thread.sleep(1000);
	
	Actions ob = new Actions(driver);
	ob.sendKeys(Keys.ESCAPE).build().perform();
//	Thread.sleep(1000);
	
	WebElement Dellevry_om_line= driver.findElement(By.xpath("//*[@data-quid='main-navigation-order-online']"));
	Dellevry_om_line.click();
//	Thread.sleep(1000);
	
	WebElement Dellevry_tab= driver.findElement(By.xpath("//*[@id='tab-Delivery']"));
	Dellevry_tab.click();
//	Thread.sleep(1000);
	
	WebElement Address_Type= driver.findElement(By.xpath("//*[@id='Type']"));
	Select OS = new Select(Address_Type);
	OS.selectByVisibleText("House");
//	Thread.sleep(1000);
	
	WebElement Street= driver.findElement(By.xpath("//*[@id='Street']"));
	Street.sendKeys("477 crooks ave");
//	Thread.sleep(1000);
	
	WebElement APT= driver.findElement(By.xpath("//*[@id='UnitNumber']"));
	APT.sendKeys("1");
//	Thread.sleep(1000);
	
	WebElement Zip= driver.findElement(By.xpath("//*[@name='PostalCode']"));
	Zip.clear();
//	Thread.sleep(1000);
	Zip.sendKeys("07011");
//	Thread.sleep(1000);
	
	
	WebElement City= driver.findElement(By.xpath("//*[@id='City']"));
	City.clear();
//	Thread.sleep(1000);
	City.sendKeys("Clifton");
//	Thread.sleep(1000);
	
	try {
	WebElement State= driver.findElement(By.xpath("//*[@id='Regiion']"));
	if(State.isDisplayed()) {
	State.sendKeys("NY");}
//	else {System.out.println("State webelement not display");}
	}catch (Exception e) {System.out.println("Exception e, State webelement not display");}
//	Thread.sleep(1000);
	
	WebElement C_F_D_Tab= driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
	C_F_D_Tab.click();
//	Thread.sleep(3000);
	
	
	driver.close();
	
	
	
	}

}
