package DataDrivenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handdler_Class
{
	public static void main(String[] args) 
	{
		// Type of browser and path of driver
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		// Launch empty browser
		WebDriver driver = new ChromeDriver();
		// Maximize window
		driver.manage().window().maximize();
		
		
		
	}
}
