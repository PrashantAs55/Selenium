package DataDrivenPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterData_ClearData 
{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/prash/OneDrive/Desktop/Frames/email.html");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Admin@123");
		WebElement frame1 = driver.findElement(By.xpath(""));
		
	
	}
	
	
	
	
}
