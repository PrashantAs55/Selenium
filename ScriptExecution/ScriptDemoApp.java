package ScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptDemoApp 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		//create object
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	
	driver.manage().window().maximize();
	WebElement starts = driver.findElement(By.xpath(""));
	}	
}
