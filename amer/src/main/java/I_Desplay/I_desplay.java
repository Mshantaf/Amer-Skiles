package I_Desplay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class I_desplay {
    public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");  
		driver = new ChromeDriver();    // Opening chrome broser    
	    driver.get("https://www.dominos.com/");  // Navigate to Website
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	    
	    
		Actions ob = new Actions(driver);
		ob.sendKeys(Keys.ESCAPE).build().perform();
//		Thread.sleep(1000);
	    
		
		WebElement Dellevry_om_line= driver.findElement(By.xpath("//*[@data-quid='main-navigation-order-online']"));
		if (Dellevry_om_line.isDisplayed()) { Dellevry_om_line.click();}
		else {System.out.println("Webelement is not corect");}
		
		WebElement Dellevry_tab= driver.findElement(By.xpath("//*[@id='tab-Delivery']"));
		Dellevry_tab.click();
//		Thread.sleep(1000);
		
		WebElement Address_Type= driver.findElement(By.xpath("//*[@id='Type']"));
		Select OS = new Select(Address_Type);
		OS.selectByVisibleText("House");
//		Thread.sleep(1000);
		
		try {
		WebElement Street= driver.findElement(By.xpath("//*[@id='StreeEt']"));
		if (Street.isDisplayed()) {Street.sendKeys("477 crooks ave");}
		}catch(Exception e)	{System.out.println("Exciption e , Street webelement not displayed ");}
		
		WebElement APT= driver.findElement(By.xpath("//*[@id='UnitNumber']"));
		APT.sendKeys("1");
//		Thread.sleep(1000);
		
		WebElement Zip= driver.findElement(By.xpath("//*[@name='PostalCode']"));
		Zip.clear();
//		Thread.sleep(1000);
		Zip.sendKeys("07011");
//		Thread.sleep(1000);
		
		
		WebElement City= driver.findElement(By.xpath("//*[@id='City']"));
		City.clear();
//		Thread.sleep(1000);
		City.sendKeys("Clifton");
//		Thread.sleep(1000);
		
		try {
		WebElement State= driver.findElement(By.xpath("//*[@id='Region']"));
		if(State.isDisplayed()) {
		State.sendKeys("NY");}
//		else {System.out.println("State webelement not display");}
		}catch (Exception e) {System.out.println("Exception e, State webelement not display");}
//		Thread.sleep(1000);
		
		WebElement C_F_D_Tab= driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
		C_F_D_Tab.click();
//		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
