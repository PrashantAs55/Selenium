package ScriptExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_Drag_Drop_Simple {

  public static void main(String[] args) {

    // SetChromeDriver path (if not set in System Property)
    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
    driver.manage().window().maximize();

    // Locate source and destination elements
    WebElement src = driver.findElement(By.xpath("//div[@draggable='true']"));
    WebElement dstn = driver.findElement(By.xpath("//div[@id='target']"));
    
    
    WebElement src2 = driver.findElement(By.xpath("//div[@id='target']"));
    WebElement dstn2 = driver.findElement(By.xpath("//div[@class='green']"));
   
  
    

    // Perform drag and drop
    Actions act = new Actions(driver);
    act.dragAndDrop(src, dstn).perform();
    act.dragAndDrop(src2, dstn2).perform();
    
    

  }
}






/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_Drag_Drop_02 {

  public static void main(String[] args) throws InterruptedException {

    // SetChromeDriver path (if not set in System Property)
    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds

    driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
    driver.manage().window().maximize();

    // Wait for source and destination elements to be present (not necessarily visible)
    WebElement src = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@draggable='true']")));
    WebElement dstn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='target']")));

    Actions act = new Actions(driver);
    act.dragAndDrop(src, dstn).perform();
  }
}

*/