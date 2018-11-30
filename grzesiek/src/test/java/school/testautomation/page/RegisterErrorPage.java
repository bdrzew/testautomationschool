package school.testautomation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterErrorPage extends RegisterPage {

    @FindBy(id = "customer.username.errors")
    private WebElement usernameError;

    @FindBy(id = "repeatedPassword.errors")
    private WebElement repeatedPasswordError;

    public RegisterErrorPage(WebDriver driver) {
        super(driver);
    }

    public String getUsernameError() {
        return usernameError.getText();
    }

    public String getRepeatedPasswordError() {
        return repeatedPasswordError.getText();
    }
}