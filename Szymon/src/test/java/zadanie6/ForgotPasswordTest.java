package zadanie6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import zadanie6.page.ForgotPasswordPage;
import zadanie6.page.LeftNavigationMenu;
import zadanie6.page.MainPage;
import zadanie6.page.RegisterPage;
import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest {
    private WebDriver driver;
    private RegisterPage registerPage;
    private ForgotPasswordPage forgotPasswordPage;
    private LeftNavigationMenu mainPage;


    @BeforeClass
    public void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        registerPage = new RegisterPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
        mainPage = new MainPage(driver);
    }

    @BeforeMethod
    public void testSetup() {
        registerPage.openPage("http://parabank.parasoft.com/parabank/lookup.htm");
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
    public void forgotPasswordFillFormTest (){
        RegisterPage user = new RegisterPage(driver);
        user.createRegularUser();
        mainPage.clickLogout();
        mainPage.clickForgotLoginInfo();
        forgotPasswordPage.enterFirstName(user.getFirstName());
        forgotPasswordPage.enterLastName(user.getLastName());
        forgotPasswordPage.enterAddress(user.getAddres());
        forgotPasswordPage.enterCity(user.getCity());
        forgotPasswordPage.enterState(user.getState());
        forgotPasswordPage.enterZipCode(user.getZipCode());
        forgotPasswordPage.enterSSN(user.getSsn());
        forgotPasswordPage.clickFindMyLogin();

        //        assertEquals("aktualne", "oczekiwane");
        assertEquals(forgotPasswordPage.getConfirmationText(), "Your login information was located successfully. You are now logged in.");
        assertEquals(forgotPasswordPage.getUsernameText(), user.getUsername());
        assertEquals(forgotPasswordPage.getPasswordText(), user.getPassword());

    }


}
