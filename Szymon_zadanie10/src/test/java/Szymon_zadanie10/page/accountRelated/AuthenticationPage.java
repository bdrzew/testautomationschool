package Szymon_zadanie10.page.accountRelated;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends BaseStorePage {
    @FindBy (id = "email_create")
    private WebElement emailCreateField;
    @FindBy (id = "SubmitCreate")
    private WebElement createAnAccountButton;
    @FindBy (xpath = "//div[@id='create_account_error']")
    private WebElement createErrorField;
    @FindBy (id = "email")
    private WebElement emailToSignInField;
    @FindBy (id = "passwd")
    private WebElement PasswordToSignInField;
    @FindBy (id = "SubmitLogin")
    private WebElement signInButton;
    @FindBy (xpath = "//p[contains(text(),'There is 1 error')]/../ol")
    private WebElement signInErrorField;


    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public AuthenticationPage enterEmailCreate(String email) {
        emailCreateField.sendKeys(email);
        return this;
    }
    public WebElement getCreateErrorField() {
        return createErrorField;
    }

    public AuthenticationPage enterEmailToSignIn(String email) {
        emailToSignInField.sendKeys(email);
        return this;
    }

    public AuthenticationPage enterPasswordToSignIn(String password) {
        PasswordToSignInField.sendKeys(password);
        return this;
    }

    public WebElement getSignInErrorField() {
        return signInErrorField;
    }

    public AccountCreationFormPage clickCreateAnAccountButtonAndRedirect() {
        createAnAccountButton.click();
        return new AccountCreationFormPage(driver);
    }
    public AuthenticationPage clickCreateAnAccountButtonNoRedirect() {
        createAnAccountButton.click();
        return this;
    }

    public MyAccountPage clickSignInAndRedirect() {
        signInButton.click();
        return new MyAccountPage(driver);
    }

    public AuthenticationPage clickSignInNoRedirect() {
        signInButton.click();
        return this;
    }
}
