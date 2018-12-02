package zadanie7.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class RegistrationPage extends Page {
    @FindBy(xpath = "//span[@id='customer.firstName.errors']")
    private WebElement userNameError;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement login;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement loginButton;


    @FindBy(xpath = "//input[@value='Register']")
    private WebElement clickRegisteration;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationPage openRegistrationPage() {
        driver.get("http://parabank.parasoft.com/parabank/register.htm");
        return this;
    }

    public RegistrationPage assertName(String name) {
        assertTrue(userNameError.getText().contains(name), "First name is required.");
        return this;
    }

    public RegistrationPage clickReg() {
        clickRegisteration.click();
        return this;
    }
}
