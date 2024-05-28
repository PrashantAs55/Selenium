package ScriptExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_Orange_HRM 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		WebElement psw = driver.findElement(By.xpath("//input[@name='password']"));
		psw.sendKeys("admin123");
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
		
		
		WebDriverWait ws = new WebDriverWait(driver,10);
		
		ws.until(ExpectedConditions.urlContains("orange"));
		
		
		WebElement addEmpbtn = driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --visited']"));
		addEmpbtn.click();
		
		WebElement EmpName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		EmpName.sendKeys("Test01");
		
		WebElement EmpMidName = driver.findElement(By.xpath("//input[@name='middleName']"));
		
		EmpMidName.sendKeys("Tester");
		
		WebElement EmpLasName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		EmpLasName.sendKeys("Demo");
		
		WebElement btnClick = driver.findElement(By.xpath("//button[@type='submit']"));
		btnClick.click();
		
		
	}
}
