import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import pages.StartPage;

import static org.testng.Assert.assertEquals;

public class RegistrationTests {

    private WebDriver driver;
    private StartPage startPage;
    private RegistrationPage registrationPage;

    @BeforeClass
    public void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        startPage = new StartPage(driver);
        registrationPage = new RegistrationPage(driver);
    }

    @BeforeMethod
    public void before() {
        startPage.openStartPage();
        registrationPage.openRegistrationPage();
        startPage.maximizePage();
    }

    @AfterClass
    public void teardownClass() {
        driver.quit();
    }

    @Test
    public void assertIfNameFieldIsRequired() {
        String nameError = "First name is required.";
        registrationPage.clickRegister();
        assertEquals(registrationPage.getFirstNameErrorDisplayed(), nameError);
    }
    @Test
    public void assertIfPasswordFieldsDidNotMatch() {
        String passwordsError = "The username and password could not be verified.";
        startPage.setLogin("adamm");
        startPage.setPassword("1234");
        startPage.clickLoginButton();
        assertEquals(registrationPage.getPasswordNotMatchErrorDisplayed(), passwordsError);
    }
}
