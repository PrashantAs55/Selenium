package DataDrivenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail_handler_class <T extends WebDriver>
{

	    public WebDriver launchBrowser(String driverPath) {
	        System.setProperty("webdriver." + getWebDriverName(driverPath) + ".driver", driverPath);
	        T driver = (T) new ChromeDriver(); // Assuming Chrome driver by default
	        driver.manage().window().maximize();
	        return driver;
	    }

	    private String getWebDriverName(String driverPath) {
	        // You can improve this logic to handle different WebDriver implementations
	        // Based on the file extension of the driver path
	        String extension = driverPath.substring(driverPath.lastIndexOf(".") + 1);
	        switch (extension.toLowerCase()) {
	            case "chromedriver":
	                return "chrome";
	            case "geckodriver":
	                return "gecko"; // For Firefox driver
	            default:
	                throw new IllegalArgumentException("Unsupported driver file: " + driverPath);
	        }
	    }
	}