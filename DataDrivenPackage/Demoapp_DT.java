package DataDrivenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapp_DT 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		
		driver.manage().window().maximize();
		
		
		WebElement adminName = driver.findElement(By.xpath("//p[@class='para']"));

		WebElement AdmPwd = driver.findElement(By.xpath("//p[text()='Admin@1234']"));
		
		
		
	}
}
