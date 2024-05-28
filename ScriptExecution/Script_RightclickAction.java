package ScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_RightclickAction 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//span[.='right click me']"));
		//Addres of the browser	
		Actions act = new Actions(driver);
			act.contextClick(button).perform();
			
			WebElement dsektop = driver.findElement(By.xpath("//a[@href='/software']"));
			
			dsektop.click();
	}
}
