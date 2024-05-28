package ScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_DragandDrop 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
	    WebElement  scr = driver.findElement(By.id("box6"));
	    WebElement  dstn = driver.findElement(By.id("box106"));
	    
		Actions act = new Actions(driver);
		act.dragAndDrop(scr, dstn).perform();
		
	
		
		
		
	}
}
