package zadanie7.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Page {

    @FindBy(css = "name=username")
    private WebElement login;

    @FindBy(css = "name=password")
    private WebElement password;

    @FindBy(css = ".login .button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
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
        return new LoginPage(driver, "http://parabank.parasoft.com/");
    }
}
