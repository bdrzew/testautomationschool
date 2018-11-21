import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
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
        startPage.openPage("http://parabank.parasoft.com");
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
        String passwordsError = "Passwords did not match.";

        registrationPage.setFirstName("Piotr");
        registrationPage.setLastName("Nowak");
        registrationPage.setAddress("Nowohucka 21");
        registrationPage.setCity("Krakow");
        registrationPage.setState("Malopolskie");
        registrationPage.setZipCode("11-222");
        registrationPage.setPhone("111-222-333");
        registrationPage.setSnn("12345");
        registrationPage.setUsername("673498031");
        registrationPage.setPasswordReg("AlaMaKota123");
        registrationPage.setConfirmPassword("AlaMaKota124");
        registrationPage.clickRegister();
        assertEquals(registrationPage.getPassDidNotMatchErrorDisplayed(), passwordsError);
    }
}
