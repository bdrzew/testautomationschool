package Szymon_zadanie10.test.common;

import Szymon_zadanie10.config.DriverType;
import Szymon_zadanie10.config.LocalWebDriverFactory;
import Szymon_zadanie10.config.RemoteWebDriverFactory;
import Szymon_zadanie10.config.WebDriverFactory;
import Szymon_zadanie10.page.firstPage.FirstPage;
import org.fluttercode.datafactory.impl.DataFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public abstract class SeleniumTest {
    protected WebDriver driver;
    private WebDriverFactory webDriverFactory = getWebDriverFactory();

    @BeforeClass(alwaysRun = true)
    public void classSetup() {
        driver = webDriverFactory.getDriver(
                DriverType.valueOf(System.getProperty("driver", "firefox").toUpperCase()));
        driver.navigate().to("http://automationpractice.com");

    }

    @AfterMethod
    public void testTearDown(){
        try {
            new FirstPage(driver)
                    .getHeaderComponent()
                    .clickSignOut();
        } catch (Exception e) {
        }
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
