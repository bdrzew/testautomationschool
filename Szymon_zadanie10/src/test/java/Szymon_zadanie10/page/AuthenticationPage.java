package Szymon_zadanie10.page;

import Szymon_zadanie10.page.common.AbstractStorePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class AuthenticationPage extends AbstractStorePage {
    @FindBy (id = "email_create")
    private WebElement emailCreateField;
    @FindBy (id = "SubmitCreate")
    private WebElement createAnAccountButton;

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
}
