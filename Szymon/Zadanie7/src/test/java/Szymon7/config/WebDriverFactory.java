package Szymon7.config;

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
    private WebDriverFactory () {}

    public static WebDriver getDriver (DriverType browser){
        WebDriver driver = null;
        switch (browser) {
            case IE:
                driver = getInternetExplorerDriver();
                break;
            case CHROME:
                driver = getChromeDriver();
                break;
            case FIREFOX:
                driver = getFirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }

    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver();
        return new FirefoxDriver();
    }

    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver();
        return new ChromeDriver();
    }

    private static WebDriver getInternetExplorerDriver() {
        WebDriverManager.iedriver();
        return new InternetExplorerDriver();
    }
}
