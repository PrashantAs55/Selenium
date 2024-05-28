package ScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_mouse_hover {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/tooltips");
		
		driver.manage().window().maximize();
		
		WebElement tooltip = driver.findElement(By.xpath("//button[@id='btn1']"));
		WebElement tooltip2 = driver.findElement(By.xpath("//button[@id='btn2']"));
		
		
		
		Actions hover = new Actions(driver);
		
		hover.moveToElement(tooltip).perform();
		hover.moveToElement(tooltip2).perform();
		
		
}
}
