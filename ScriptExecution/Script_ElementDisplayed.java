package ScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_ElementDisplayed {			

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("file:///C:/Users/prash/OneDrive/Desktop/ElementDisplayed.html");
		driver.manage().window().maximize();
		WebElement cb = driver.findElement(By.xpath("//input[@type='Checkbox']"));
boolean res = cb.isDisplayed();		
if(res)
{
	System.out.println("Element is displayed");
}
else
{
	System.out.println("Element is not displayed");
}
	}

}
