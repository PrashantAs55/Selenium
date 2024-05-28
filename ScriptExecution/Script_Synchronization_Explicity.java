package ScriptExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_Synchronization_Explicity 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// Create Object
		
		WebDriverWait ws = new WebDriverWait(driver,10);
		
	String	url = driver.getCurrentUrl();
	
	ws.until(ExpectedConditions.urlContains("facebook"));
	
	System.out.println(url);
	
	String title = driver.getTitle();
	ws.until(ExpectedConditions.titleContains("Facebook"));
	System.out.println(title);
		
	}
}
