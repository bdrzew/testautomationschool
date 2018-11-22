package zadanie6;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import zadanie6.page.RegisterPage;

import static org.testng.Assert.assertEquals;

/**
 * This class is designed to test register form at
 * http://parabank.parasoft.com/parabank/register.htm
 */
public class RegistrationTest {

    private WebDriver driver;
    private RegisterPage registerPage;

    @BeforeClass
    public void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        registerPage = new RegisterPage(driver);
    }

    @BeforeMethod
    public void testSetup() {
        registerPage.openPage("http://parabank.parasoft.com/parabank/register.htm");
    }

    @AfterMethod
    public void testTeardown() {
        try {
            registerPage.clickLogout();
        } catch (Exception e) {
        }
    }

    @AfterClass
    public void teardownClass() {
        driver.quit();
    }


    @Test
    public void accountCreatedSuccessfullyByMethodTest() {
        registerPage.createRegularUser();
        assertEquals("Welcome " + registerPage.getUsername()
                        + "\nYour account was created successfully. You are now logged in.",
                registerPage.getConfirmMessageText());

    }


}
