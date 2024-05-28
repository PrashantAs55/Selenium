package DataDrivenPackage;



	

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Test 
	{
		public static void main(String[] args) {
			
			
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
			driver.manage().window().maximize();
			
			//put some explicit wait
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
			
			
			
			//get current URL
			String str = driver.getCurrentUrl();
			wait.until(ExpectedConditions.urlContains("demo"));
			System.out.println(str);
			
			//login
			WebElement logn = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
			wait.until(ExpectedConditions.visibilityOf(logn));
			
			WebElement lognbtn = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
			wait.until(ExpectedConditions.visibilityOf(lognbtn));
			
			WebElement uname = driver.findElement(By.xpath("//input[@class='email']"));
			uname.sendKeys("Admin001@gmail.com");
			
			WebElement pwd = driver.findElement(By.xpath("//input[@class='password']"));
			pwd.sendKeys("Admin@123");
			
			WebElement remme = driver.findElement(By.xpath("(//input[@name='RememberMe'])[1]"));
			remme.click();
			
			WebElement lgnbttn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			wait.until(ExpectedConditions.visibilityOf(lgnbttn));
			lgnbttn.click();
			
			
			

		}

	}
