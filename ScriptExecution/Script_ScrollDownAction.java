package ScriptExecution;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_ScrollDownAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		
		d.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)");		
		
	}
}

