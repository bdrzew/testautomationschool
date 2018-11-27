package Szymon7.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Szymon7.page.RegisterPage;
import Szymon7.page.RegistrationConfirmationPage;


public abstract class SeleniumTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeTest
    public String beforeEachTest(){
        return new RegisterPage(driver).username(5);
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
