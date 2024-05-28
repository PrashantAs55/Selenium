package ScriptExecution;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_ChildTab_Close 
{
	public static void main(String[] args) throws InterruptedException 
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
		WebElement mob =  driver.findElement(By.xpath("//img[@loading='eager'][1]"));
		w.until(ExpectedConditions.visibilityOf(mob));
		mob.click();
		String parent = driver.getWindowHandle();
		Set<String> wins = driver.getWindowHandles();
		wins.remove(parent);
		
		for(String win :wins)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);	
			driver.close();
			
		}
	}
}
