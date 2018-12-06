package test.automation.school.test.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import test.automation.school.config.DriverType;
import test.automation.school.config.WebDriverFactory;

public abstract class SeleniumTest {
    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void classSetup() {
        driver = WebDriverFactory.getDriver(
                DriverType.valueOf(System.getProperty("driver", "chrome").toUpperCase()));
    }

    @AfterClass(alwaysRun = true)
    public void classTeardown() {
        driver.quit();
    }
}
