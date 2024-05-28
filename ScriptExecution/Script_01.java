package ScriptExecution;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script_01 
{
public static void main(String[] args) 
{
	
	//Invoking Browser
	//ChromeDriver is class
	//Create object of the class We need to create the object of the class to access the methods present in the class
	//Webdriver interface
	
	
 System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
 ChromeDriver driver = new ChromeDriver();
 driver.get("https://www.google.com/");
}
}
