package ScriptExecution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_TestCase_Cart_Open_new_Tab_Login 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// hit Url 
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("(//input[@title='Search for Products, Brands and More'])"));
		WebDriverWait w = new WebDriverWait(driver,10);
		search.sendKeys("Mobile"); 
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		Thread.sleep(2000);
		//WebElement mob =  driver.findElement(By.xpath("//img[@loading='eager'][1]"));
		//w.until(ExpectedConditions.visibilityOf(mob));
		//mob.click();
		
		WebElement cart = driver.findElement(By.xpath("(//span[.='Cart'])"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(cart).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		  Set<String> rf = driver.getWindowHandles();
		  ArrayList<String> arr = new ArrayList<String>(rf);
		  String art = arr.get(1);
		  driver.switchTo().window(art);
		  
		
		/*
		for(String win :wins)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if(win.equals(parent))
			{	
			driver.close();
			}
		}
		*/
	}
}
