package ScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script_hrm {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Log in
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        // Navigate to employee list page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");

        // Selecting employment status
        WebElement employmentStatusDropdown = driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
        
        
        // Select an option by visible text
        
// 
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
