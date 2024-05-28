package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Property_Example 
{
	@Test
	public static void Demo() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.id("email"));
		WebElement psw = driver.findElement(By.id("pass"));
		//WebElement lgn = driver.findElement(By.name("login"));
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./Test_Properties/TestData.properties");
		prop.load(fis);
		String pss = prop.getProperty("psw");
		String usr = prop.getProperty("usn");
		
		usn.sendKeys(usr);
		psw.sendKeys(pss);
		
		
		
		
		
	}
}
