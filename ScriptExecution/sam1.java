package ScriptExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam1 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedrivers.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
	}
	

}
