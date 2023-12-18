package Try_catch_and_Find_Elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Find_Elements_with_Implicit_wait {
	 public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\mshan\\Desktop\\New folder (2)\\batch7-master\\2023_batch_bootcamp\\drivers\\chromedriver.exe");  
		driver = new ChromeDriver();    // Opening chrome broser    
	    driver.get("https://www.dominos.com/");  // Navigate to Website
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
	    
	    
		Actions ob = new Actions(driver);
		ob.sendKeys(Keys.ESCAPE).build().perform();
	    
		
		try {
		WebElement Dellevry_om_line= driver.findElement(By.xpath("//*[@data-quid='main-navigation-order-online']"));
		if (Dellevry_om_line.isDisplayed()) { Dellevry_om_line.click();}
		}catch(Exception e) {System.out.println("Webelement is not corect");}
		
		WebElement Dellevry_tab= driver.findElement(By.xpath("//*[@id='tab-Delivery']"));
		Dellevry_tab.click();
		
		WebElement Address_Type= driver.findElement(By.xpath("//*[@id='Type']"));
		Select OS = new Select(Address_Type);
		OS.selectByVisibleText("House");
		
		// 1- handle exceptions by Try & catch
		try {
		WebElement Street= driver.findElement(By.xpath("//*[@id='Street']"));
		if (Street.isDisplayed()) {Street.sendKeys("477 crooks ave");}
		}catch(Exception e)	{System.out.println("Exciption e , Street webelement not displayed ");}
		
		WebElement APT= driver.findElement(By.xpath("//*[@id='UnitNumber']"));
		APT.sendKeys("1");
		
		// 2- handle exceptions by list of elements
		List<WebElement> Zip= driver.findElements(By.xpath("//*[@name='PostalCode']"));
		if(Zip.size()>0) {
		WebElement zipElement = Zip.get(0);  // Get the first WebElement from the list
		zipElement.click();
//		ob.sendKeys(Keys.CLEAR).build().perform(); // it doesn't work??
		zipElement.clear();
		zipElement.sendKeys("77498");}
		else {System.out.println("Zip webelement not displayed");}
		
		
		WebElement City= driver.findElement(By.xpath("//*[@id='City']"));
		City.clear();
		City.sendKeys("Clifton");
		
		try {
		WebElement State= driver.findElement(By.xpath("//*[@id='Region']"));
		if(State.isDisplayed()) {
		State.sendKeys("NY");}
		}catch (Exception e) {System.out.println("Exception e, State webelement not display");}
		
		WebElement C_F_D_Tab= driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
		C_F_D_Tab.click();
		driver.close();
		
		
		
	}
	}


