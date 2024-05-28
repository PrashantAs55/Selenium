package DataDrivenPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NopCommerce_Automatiion 
{
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	driver.manage().window().maximize();
	WebDriverWait w = new WebDriverWait(driver,10);
	String url = driver.getCurrentUrl();
	w.until(ExpectedConditions.urlContains("demo"));
	System.out.println(url);
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	btn.click();
	
	WebElement cust = driver.findElement(By.xpath("//i[@class='nav-icon far fa-user']"));
	w.until(ExpectedConditions.visibilityOf(cust));
	cust.click();
	
	WebElement custdrop = driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']"));
	w.until(ExpectedConditions.visibilityOf(custdrop));
	custdrop.click();
	
	// click on add new btn
	WebElement addnew = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
	
	w.until(ExpectedConditions.visibilityOf(addnew));
	addnew.click();
	
	WebElement entrmail = driver.findElement(By.xpath("//input[@class='form-control text-box single-line']"));
	entrmail.sendKeys("Admin001@gmail.com");
	
	 WebElement submitButton = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='save']")));
     submitButton.click();

     System.out.println("Successfully added new customer with email: Admin001@gmail.com");
     
     Thread.sleep(2000);
    		 driver.close();
}
}
