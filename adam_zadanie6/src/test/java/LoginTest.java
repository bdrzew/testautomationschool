import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StartPage;

import static org.testng.Assert.assertEquals;

public class LoginTest {
    private WebDriver driver;
    private StartPage startPage;
    @BeforeClass
    public void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        startPage = new StartPage(driver);
    }
    @BeforeMethod
    public void before() {
        startPage.openStartPage();
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
        startPage.setLogin("adamm");
        startPage.setPassword("123456");
        startPage.clickLoginButton();
        assertEquals(startPage.getLoggedInUserDisplayed(), "Welcome Adam Moskal");
    }
}
