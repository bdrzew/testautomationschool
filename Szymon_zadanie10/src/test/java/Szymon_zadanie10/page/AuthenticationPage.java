package Szymon_zadanie10.page;

import Szymon_zadanie10.page.common.AbstractStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends AbstractStorePage {
    @FindBy (id = "email_create")
    private WebElement emailCreateField;
    @FindBy (id = "SubmitCreate")
    private WebElement createAnAccountButton;
    @FindBy (id = "//div[@id='create_account_error']")
    private WebElement validatorField;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public AuthenticationPage enterEmailCreate(String email) {
        emailCreateField.sendKeys(email);
        return this;
    }

    public AccountCreationFormPage clickCreateAnAccountButton() {
        createAnAccountButton.click();
        return new AccountCreationFormPage(driver);
    }

    public WebElement getValidatorField() {
        return validatorField;
    }
}
