package DataDrivenPackage;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase_NopCommerence_Customer 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		
		WebDriverWait ws = new WebDriverWait(driver,10);
		
		String url = driver.getCurrentUrl();
		ws.until(ExpectedConditions.urlContains("demo"));
		System.out.println(url);
		
		/*
		WebElement reg = driver.findElement(By.xpath("//a[@class='ico-register']"));
		ws.until(ExpectedConditions.visibilityOf(reg));
		// Confirmation message
		System.out.println("Successfully clicked on register button: register");
		reg.click();
		
		// Registration details updation
		
		WebElement pd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		pd.click();
		
		//Till here it working fine.........
		// let fix from here
		
		// First Name
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Test001");
		
		// Last Name 
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("lastNameTest");
		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test001@gamil.com");
				
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@001");
		
		WebElement psw = driver.findElement(By.xpath("//input[@aria-describedby='ConfirmPassword-error']"));
		psw.sendKeys("Test@001");
		// Confirm Password.....
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement psw1 = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		
		
		WebElement confirmPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ConfirmPassword")));
		System.out.println(confirmPassword);
		psw1.sendKeys("Test@001");
	
		System.out.println("Successfully you have passed all inut data that are requried");
		
		// Click on Button 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement btnclick = driver.findElement(By.xpath("//button[@name='register-button']"));
		ws.until(ExpectedConditions.visibilityOf(btnclick));
		
		System.out.println("Script has clicked on Resister button ");
		*/
		
		// Login Script
	
		WebElement login = driver.findElement(By.xpath("//a[@href='/login?returnUrl=%2F']"));
		ws.until(ExpectedConditions.visibilityOf(login));
		
		
		//input[@class='email valid']
		
		WebElement loginbtn = driver.findElement(By.xpath("//a[@href='/login?returnUrl=%2F']"));
		ws.until(ExpectedConditions.visibilityOf(loginbtn));
		

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		
		email.sendKeys("Admin001@gmail.com");
		
		
		WebElement psw = driver.findElement(By.xpath("//input[@name='Password']"));
		
		psw.sendKeys("Admin@123");
		
		WebElement chk = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		chk.click();
		
		WebElement btn1 = driver.findElement(By.xpath("//button[@type='submit']"));
		ws.until(ExpectedConditions.visibilityOf(btn1));
		btn1.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		WebElement src = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		ws.until(ExpectedConditions.visibilityOf(src));
		src.sendKeys("Iphone 16 pro");
		
		// Mouse hover action
		
		WebElement mousehover = driver.findElement(By.xpath("//a[@href='/computers']"));
		Actions act = new Actions(driver);
		act.moveToElement(mousehover).perform();
		
		WebElement swclick = driver.findElement(By.xpath("(//a[@href='/software' and text()=\"Software \"])[1]"));
		Thread.sleep(2000);
		swclick.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		WebElement scrll = driver.findElement(By.xpath("//img[@title='Show details for Adobe Photoshop CS4']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView;",scrll);
		
		
		Point loc = scrll.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(loc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		js.executeScript("window.scrollBy(" + x + "," + y +")");
		
		
		WebElement addtocart = driver.findElement(By.xpath("(//button[text()=\"Add to cart\"])[1]"));
		ws.until(ExpectedConditions.visibilityOf(addtocart));
		addtocart.click();
		
		Thread.sleep(2000);
		if(addtocart.isDisplayed())
		{
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
	
		}	
		System.out.println("Product has been succesfully added to cart");  
		
		WebElement addtocart1 = driver.findElement(By.xpath("//span[@class='close']"));
		ws.until(ExpectedConditions.visibilityOf(addtocart1));
		addtocart1.click();
		
		// Work from here 
		WebElement Shpcart = driver.findElement(By.xpath("//a[@class='ico-cart']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(Shpcart).perform();
		WebElement gotoCart = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		ws.until(ExpectedConditions.visibilityOf(gotoCart));
		gotoCart.click();
		System.out.println("Product is visiable and its in cart:.."+gotoCart);
		
		// ITS WORKING FINE TILL HERE
		

		WebElement scr1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView;",scr1);
		
		
		Point loc1 = scr1.getLocation();
		int x1 = loc.getX();
		int y1 = loc.getY();
		System.out.println(loc1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		js.executeScript("window.scrollBy(" + x1 + "," + y1 +")");
		
		System.out.println("Location of your scroll bar");
		
		// Work from here........
		
		WebElement gift = driver.findElement(By.xpath("//select[@id='checkout_attribute_1']"));
		Select sc = new Select(gift);
		sc.selectByValue("No");
		System.out.println("Yoh have scrolled down till here");
		
		WebElement chkbox = driver.findElement(By.xpath("//div[@class='terms-of-service']"));
		ws.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//div[@class='terms-of-service']"), true));
		chkbox.click();
		
		Thread.sleep(2000);
		if(chkbox.isDisplayed())
		{
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
	
		}
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		ws.until(ExpectedConditions.visibilityOf(checkout));
		checkout.click();
		
		System.out.println("You have successfully checkout");
	}
}