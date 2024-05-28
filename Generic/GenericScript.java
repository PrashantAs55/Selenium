package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void open()
	
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
