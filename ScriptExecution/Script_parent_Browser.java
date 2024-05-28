package ScriptExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_parent_Browser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       // Implicitly wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		WebElement btn = driver.findElement(By.xpath("//button[text()=('Click to open multiple tabs')]"));
		btn.click();
		String parent_id = driver.getWindowHandle();
		System.out.println(parent_id);
		Thread.sleep(1000);
		driver.quit();	
	}
}
