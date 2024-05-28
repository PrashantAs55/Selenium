package ScriptExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Amazon_Back_to_Top 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement url = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		
		Point loc = url.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(loc);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		js.executeScript("window.scrollBy(" + x + "," + y +")");
		
		
		
	}
}
