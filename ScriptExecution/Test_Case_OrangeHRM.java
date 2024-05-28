package ScriptExecution;


	import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Test_Case_OrangeHRM 
	{
			public static void main(String[] args) throws Exception 
			{
				
				System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
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
			    ws.until(ExpectedConditions.elementToBeClickable(pim));
				pim.click();
				
				
				WebElement addEmpbtn = driver.findElement(By.className("//a[@class='oxd-topbar-body-nav-tab-item' and text()='Add Employee']"));
				ws.until(ExpectedConditions.elementToBeClickable(addEmpbtn));
				addEmpbtn.click();
				
				/*
				FileInputStream fis = new FileInputStream("./ExcelFile/Orange.xlsx");
				Workbook Book = WorkbookFactory.create(fis);
				Sheet sheet = Book.getSheet("Sheet1");
				
				
				Row rw = sheet.getRow(0);
				Cell c1 = rw.getCell(0);
				String value = c1.getStringCellValue();
				WebElement EmpName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				EmpName.sendKeys(value);
				
				
				Row rw2 = sheet.getRow(0);
				Cell c2 = rw2.getCell(1);
				String values = c2.getStringCellValue();
				WebElement EmpMidName = driver.findElement(By.xpath("//input[@name='middleName']"));
				
				EmpMidName.sendKeys(values);
				
				Row rw3 = sheet.getRow(0);
				Cell c3 = rw3.getCell(2);
				String values1 = c3.getStringCellValue();
				
				
				WebElement EmpLasName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				
				EmpLasName.sendKeys(values1);
				
				WebElement btnClick = driver.findElement(By.xpath("//button[@type='submit']"));
				btnClick.click();
				*/
				driver.close();
			}
			
	}