package zadanie10.test.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import zadanie10.config.DriverType;
import zadanie10.config.LocalWebDriverFactory;
import zadanie10.config.RemoteWebDriverFactory;
import zadanie10.config.WebDriverFactory;

public abstract class AutomationPractiseTest {

    protected WebDriver driver;

    @BeforeClass
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public void classTeardown() {
        driver.quit();
    }
/*    protected WebDriver driver;
    private WebDriverFactory webDriverFactory = getWebDriverFactory();

    @BeforeClass(alwaysRun = true)
    public void classSetup() {
        driver = webDriverFactory.getDriver(
                DriverType.valueOf(System.getProperty("driver", "chrome").toUpperCase()));
    }

    @AfterClass(alwaysRun = true)
    public void classTeardown() {
        driver.quit();
    }

    private WebDriverFactory getWebDriverFactory() {
        boolean isRemote = Boolean.valueOf(System.getProperty("remote", "false"));
        return isRemote ? new RemoteWebDriverFactory() : new LocalWebDriverFactory();
    }*/
}
