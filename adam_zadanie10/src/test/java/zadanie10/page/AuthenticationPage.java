package zadanie10.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import zadanie10.page.common.MainPage;

public class AuthenticationPage extends MainPage {
    @FindBy(id = "email")
    private WebElement emailInLoginField;
    @FindBy(id = "passwd")
    private WebElement passwordInLoginField;
    @FindBy(id = "SubmitLogin")
    private WebElement logInButton;

    public AuthenticationPage(WebDriver driver) {
        super(driver);

    }

    public AuthenticationPage enterEmailToLogin(String email) {
        emailInLoginField.sendKeys(email);
        return this;
    }

    public AuthenticationPage enterPasswordToLogin(String password) {
        passwordInLoginField.sendKeys(password);
        return this;
    }

    public AuthenticationPage clickLogIn() {
        logInButton.click();
        return this;
    }
}
