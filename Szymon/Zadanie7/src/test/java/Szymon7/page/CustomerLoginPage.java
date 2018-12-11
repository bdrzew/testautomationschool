package Szymon7.page;

import Szymon7.page.common.Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class CustomerLoginPage extends Page {

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement findRegisterButton;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;
    @FindBy (xpath = "//input[@name='password']")
    private WebElement findPasswordButton;
    @FindBy (xpath = "//input[@value='Log In']")
    private WebElement findLoginButton;

    public CustomerLoginPage(WebDriver driver) {
        super(driver);
    }

    public CustomerLoginPage enterUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    public RegisterPage clickRegisterLink() {
        findRegisterButton.click();
        return new RegisterPage(driver);
    }

    public CustomerLoginPage enterPassword(String password) {
        findPasswordButton.sendKeys(password);
        return this;
    }

    public CustomerLoginPage clickLogIn() {
        findLoginButton.click();
        return this;
    }
}
