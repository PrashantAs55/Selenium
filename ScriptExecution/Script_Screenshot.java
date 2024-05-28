package ScriptExecution;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Script_Screenshot 
{
public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("C:\\Users\\prash\\OneDrive\\Pictures\\Screenshots\\Defect1814.jpeg");
		FileHandler.copy(temp, perm);
		
		
		
				
		
		
		
		
		
	}
}
