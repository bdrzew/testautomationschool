package zadanie6;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.assertj.core.api.Assertions;
import org.testng.annotations.*;
import zadanie6.page.MainPage;
import zadanie6.page.RegisterPage;

import static org.testng.Assert.assertEquals;

/**
 * This class is designed to test elements for main page and left menu
 * at http://parabank.parasoft.com/parabank/index.htm
 */
public class LoginTest {

    private WebDriver driver;
    private MainPage mainPage;

    @BeforeClass
    public void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
    }

    @BeforeMethod
    public void testSetup() {
        mainPage.openPage("http://parabank.parasoft.com/parabank/register.htm");
    }

    @AfterMethod
    public void testTeardown() {
        try {
            mainPage.clickLogout();
        } catch (Exception e) {
        }
    }

    @AfterClass
    public void teardownClass() {
        driver.quit();
    }


    @Test
    public void successfulLoginTest() {
        RegisterPage userWillBe = new RegisterPage(driver);
        userWillBe.createRegularUser();
        mainPage.clickLogout();
        mainPage.enterUsername(userWillBe.getUsername());
        mainPage.enterPassword(userWillBe.getPassword());
        mainPage.clickLogin();


//        assertEquals("aktualne", "oczekiwane");
        assertEquals("Welcome " + userWillBe.getFirstName() + " "
                + userWillBe.getLastName(), mainPage.getWelcomeUserText());
    }


}
