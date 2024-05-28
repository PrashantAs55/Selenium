package ScriptExecution;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Num_Browser_ID_browser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// get browser address
		driver.navigate().to("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		WebElement btn = driver.findElement(By.xpath("//button[text()=('Click to open multiple tabs')]"));
		btn.click();
		
		Set<String> wins = driver.getWindowHandles();
		
		int count = wins.size();
		System.out.println(count);
		
		for(String win : wins)
		{
			System.out.println(win);
		}
	}
}
