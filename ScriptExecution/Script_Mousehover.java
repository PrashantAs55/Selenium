package ScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_Mousehover 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement fashion = driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
		Actions hover = new Actions(driver);
		
		hover.moveToElement(fashion).perform();
		
		
		
	}
}
