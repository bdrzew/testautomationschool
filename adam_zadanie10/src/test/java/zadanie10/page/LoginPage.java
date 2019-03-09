package zadanie10.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import zadanie10.page.common.MainPage;
import zadanie10.page.common.Page;

public class LoginPage extends MainPage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='SubmitLogin']//span")
    private WebElement button;

    public LoginPage selectEmail(String mail) {
        new Select(email).selectByValue(mail);
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

    public LoginPage getEmail(){
        return (LoginPage) email;
    }

    public LoginPage(WebDriver driver) {
        super(driver);
        //driver.get(url);
    }
}
