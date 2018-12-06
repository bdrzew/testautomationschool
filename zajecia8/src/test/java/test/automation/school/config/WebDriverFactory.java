package test.automation.school.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Factory for different types of drivers.
 * This can be controlled via command line parameter.
 */
public class WebDriverFactory {
    private WebDriverFactory() {}

    public static WebDriver getDriver(DriverType browser) {
        WebDriver driver = null;
        switch (browser) {
            case FIREFOX:
                driver = getFirefoxDriver();
                break;
            case CHROME:
                driver = getChromeDriver();
                break;
            case IE:
                driver = getInternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }

    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static WebDriver getInternetExplorerDriver() {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
}