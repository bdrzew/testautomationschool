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
public class RegisterTest {

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
    public void accountCreatedSuccessfullyTest() {
        registerPage.enterFirstName("Jan");
        registerPage.enterLastName("Nowak");
        registerPage.enterAddress("Sesame Street");
        registerPage.enterCity("Kraków");
        registerPage.enterState("Best State");
        registerPage.enterZipCode("31-543");
        registerPage.enterPhoneNumber("777888999");
        registerPage.enterSsn("1234567890");
        String usernameIncoming = registerPage.getRandomUsername(5);
        registerPage.enterUsernameToRegisterForm(usernameIncoming);
        registerPage.enterPasswordToRegisterForm("1");
        registerPage.confirmPasswordField("1");
        registerPage.clickRegisterButton();

        assertEquals("Welcome " + usernameIncoming
                        + "\nYour account was created successfully. You are now logged in.",
                registerPage.getConfirmMessageText());

    }

    @Test
    public void accountCreatedSuccessfullyByMethodTest(){
        registerPage.createRegularUser();
        assertEquals("Welcome " + registerPage.getUsername()
                        + "\nYour account was created successfully. You are now logged in.",
                registerPage.getConfirmMessageText());

    }


}
