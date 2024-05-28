package Runner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.GenericScript;

public class Runner extends GenericScript
{
	@Test
	public void Login()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("ajsdss");
		driver.findElement(By.id("pass")).sendKeys("ajsdss");
		driver.findElement(By.name("login")).click();
		
	}
	
	
}
