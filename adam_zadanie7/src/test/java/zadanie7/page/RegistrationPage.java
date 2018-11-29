package zadanie7.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class RegistrationPage extends Page {
    @FindBy(xpath = "//span[@id='customer.firstName.errors']")
    private WebElement userNameError;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement login;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[@class='error']")
    private WebElement errorPasswd;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement clickRegisteration;


    public RegistrationPage(WebDriver driver, String url) {

        super(driver);
    }

    public RegistrationPage assertName(String name) {
        assertTrue(userNameError.getText().contains(name), "First name is required.");
        return this;
    }

    public RegistrationPage setLogin(String userLogin) {
        login.sendKeys(userLogin);
        return this;
    }

    public RegistrationPage setPassword(String userPassword) {
        password.sendKeys(userPassword);
        return this;
    }

    public RegistrationPage clickLoginButton() {
        loginButton.click();
        return new RegistrationPage(driver, "http://parabank/register.htm");
    }

    public RegistrationPage assertPasswordNotMatch(String passwd) {
        assertTrue(errorPasswd.getText().contains(passwd), "The username and password could not be verified.");
        return null;
    }

    public RegistrationPage clickReg() {
        clickRegisteration.click();
        return new RegistrationPage(driver, "http://parabank/register.htm");
    }
}
