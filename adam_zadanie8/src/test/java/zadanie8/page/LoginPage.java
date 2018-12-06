package zadanie8.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import zadanie8.page.common.Page;

public class LoginPage extends Page {
    @FindBy(xpath = "//input[@name='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement button;


    public LoginPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }

    public LoginPage selectUsername(String user) {
        new Select(username).selectByValue(user);
        return this;
    }

    public LoginPage selectPassword(String passwd) {
        new Select(password).selectByValue(passwd);
        return this;
    }

    public LoginPage clickLoginButton() {
        button.click();
        return this;
    }
}

