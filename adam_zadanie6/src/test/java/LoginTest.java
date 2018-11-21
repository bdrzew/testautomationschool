import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import pages.StartPage;

import static org.testng.Assert.assertEquals;

public class LoginTest {
    private WebDriver driver;
    private StartPage startPage;
    //private RegistrationPage registrationPage;
    @BeforeClass
    public void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        startPage = new StartPage(driver);
        //registrationPage = new RegistrationPage(driver);
    }
    @BeforeMethod
    public void before() {
        //startPage.openPage("http://parabank.parasoft.com");
        startPage.openStartPage();
        //registrationPage.openRegistrationPage();
        startPage.maximizePage();
    }
    @AfterClass
    public void teardownClass() {
        driver.quit();
    }
    @Test
    public void assertIfUserNameIsRequired(){
        String emptyUsernameError = "Please enter a username and password.";

        startPage.setPassword("1234");
        startPage.clickLoginButton();
        assertEquals(startPage.getEmptyUsernameErrorDisplayed(), emptyUsernameError);
    }
    @Test
    public void isUserLoggedIn(){
        String emptyUsernameError = "Please enter a username and password.";

        startPage.setLogin("adamm");
        startPage.setPassword("123456");
        startPage.clickLoginButton();
        Assert.assertTrue(startPage.getLoggedInUserDisplayed());

        //assertEquals(startPage.getEmptyUsernameErrorDisplayed(), emptyUsernameError);
    }
}
