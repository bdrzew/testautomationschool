package Szymon_zadanie10.page;

import Szymon_zadanie10.page.common.AbstractStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class AuthenticationPage extends AbstractStorePage {
    @FindBy (id = "email_create")
    private WebElement emailCreateField;
    @FindBy (id = "SubmitCreate")
    private WebElement createAnAccountButton;
    @FindBy (id = "//div[@id='create_account_error']")
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

    public AbstractStorePage clickCreateAnAccountButton(boolean shouldThereBeError) {
        createAnAccountButton.click();
        AbstractStorePage page;
        if (!shouldThereBeError) {
            page = new AccountCreationFormPage(driver);
        }
        else {
            page = this;
        }
        return page;
    }

    public AbstractStorePage clickSignIn(boolean shouldThereBeError) {
        signInButton.click();
        AbstractStorePage page;
        if (!shouldThereBeError) {
            page = new MyAccountPage(driver);
        }
        else {
            page = this;
        }
        return page;
    }

    public WebElement getSignInErrorField() {
        return signInErrorField;
    }
}
