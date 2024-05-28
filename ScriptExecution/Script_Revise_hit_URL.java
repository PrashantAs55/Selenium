package ScriptExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Revise_hit_URL 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=JTDK6r1GuUU&t=1085s");
	driver.get("https://www.google.com/");
	driver.getTitle();
System.out.println(driver.getTitle());
driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
driver.quit();

}
}
