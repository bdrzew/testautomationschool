package test.automation.school.test.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import test.automation.school.config.DriverType;
import test.automation.school.config.LocalWebDriverFactory;
import test.automation.school.config.RemoteWebDriverFactory;
import test.automation.school.config.WebDriverFactory;

import java.util.ResourceBundle;

public abstract class SeleniumTest {
    protected WebDriver driver;
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
    }
}
