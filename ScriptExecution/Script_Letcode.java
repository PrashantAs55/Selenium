package ScriptExecution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script_Letcode 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);		
			
			driver.get("https://letcode.in/dropdowns");
			Thread.sleep(2000);
			
		    WebElement dropdown= driver.findElement(By.xpath("//select[@id='fruits']"));
		    
		    Select s=new Select(dropdown);
		   
		    s.selectByVisibleText("Apple");
		  //  
		    //WebElement dropdown= driver.findElement(By.xpath("//select[@id='fruits']"));
}
}