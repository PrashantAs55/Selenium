package DataDrivenPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM_DT 
{
	
			public static void main(String[] args) throws Exception 
			{
				
				System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				
				WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
				username.sendKeys("Admin");
				WebElement psw = driver.findElement(By.xpath("//input[@name='password']"));
				psw.sendKeys("admin123");
				WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
				btn.click();
					
				WebDriverWait ws = new WebDriverWait(driver,10);
				
				ws.until(ExpectedConditions.urlContains("orange"));
				
				WebElement pim = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));
			    ws.until(ExpectedConditions.visibilityOf(pim));
				pim.click();
				
				
				WebElement addEmpbtn = driver.findElement(By.className("//a[text()='Add Employee'][1]"));
				ws.until(ExpectedConditions.visibilityOf(addEmpbtn));
				addEmpbtn.click();
	
	
	
			}	
}