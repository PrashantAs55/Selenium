package ScriptExecution;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_ScrollDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/prash/OneDrive/Desktop/Scrollcode.html");
		d.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('i1').value='Prashant'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('i1').value=''");
		
			
	}
}
