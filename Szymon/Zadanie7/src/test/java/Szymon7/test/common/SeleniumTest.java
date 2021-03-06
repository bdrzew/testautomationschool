package Szymon7.test.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Szymon7.page.RegistrationConfirmationPage;


public abstract class SeleniumTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void eachTestTeardown(){
        try {
            new RegistrationConfirmationPage(driver).clickLogout();
        } catch (Exception e) {
        }
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
