package zadanie7.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;


public class LoginPage extends Page {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement login;

    @FindBy(xpath ="//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement registerButton;

    @FindBy(xpath = "//p[@class='smallText']")
    private WebElement labelWelcome;

    @FindBy(xpath = "//p[@class='error']")
    private WebElement errorPasswd;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setLogin(String inputLogin) {
        login.sendKeys(inputLogin);
        return this;
    }

    public LoginPage setPassword(String inputPassword) {
        password.sendKeys(inputPassword);
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    public LoginPage openLoginPage() {
        driver.get("http://parabank.parasoft.com/");
        return this;
    }

    public LoginPage assertIfUserIsLogin(String welcome) {
        assertTrue(labelWelcome.getText().contains(welcome), "Welcome Adam M");
        return this;
    }

    public LoginPage assertPasswordNotMatch(String passwd) {
        assertTrue(errorPasswd.getText().contains(passwd), "The username and password could not be verified.");
        return null;
    }
}
