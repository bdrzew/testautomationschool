package test.automation.school.web.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.automation.school.web.page.SalesPage;
import test.automation.school.web.page.common.Page;
import test.automation.school.web.page.login.component.HeaderComponent;

public class LoginPage extends Page {

    private HeaderComponent header;

    @FindBy(xpath = "//button[@class='btn btn-large btn-primary login-button']")
    private WebElement submitButton;
    @FindBy (id = "user_email")
    private WebElement usernameField;
    @FindBy (id = "user_password")
    private WebElement passwordField;

    public LoginPage(WebDriver driver, String url) {
        super(driver);
        driver.navigate().to(url);
        header = new HeaderComponent(driver);
    }

    public SalesPage clickLoginButton() {
        submitButton.click();
        return new SalesPage(driver);
    }

    public HeaderComponent getHeader() {
        return header;
    }

    public LoginPage enterUsername(String username) {
        usernameField.sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }
}
