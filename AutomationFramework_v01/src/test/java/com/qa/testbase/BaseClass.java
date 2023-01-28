package com.qa.testbase;

import com.qa.utils.ConfigsReader;
import com.qa.utils.Constants;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.logging.log4j.Logger;
import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    /**
     * This method will create a driver and return it
     *
     * @return WebDriver driver
     */
    public static WebDriver setUp() {

        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigsReader.getProperty("browser").toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Browser is not supported!");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigsReader.getProperty("url"));


        // we initialize all the page elements of the classes in package com.automation.pages
        PageInitializer.initialize();

        return driver;
    }
    /**
     *  This method will quit the browser
     */
    public static void tearDown()	{
        if (driver != null ) {
            driver.quit();

        }
    }
}
