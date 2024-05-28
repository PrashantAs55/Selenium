package ScriptExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locatore 
{
	public static void main(String[] args) 
	{
		
		// Open browser 
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		f
		
	
				
		 // implicit wait 5 second timeout
		// hit url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Prashant");
		
		driver.findElement(By.name("inputPassword")).sendKeys("Hi123458");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector(".error")).getText();
		
		
	}
}
