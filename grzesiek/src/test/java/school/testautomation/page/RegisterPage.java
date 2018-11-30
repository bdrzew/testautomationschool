package school.testautomation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id = "customer.firstName")
    protected WebElement firstNameInput;

    @FindBy(id = "customer.lastName")
    protected WebElement lastNameInput;

    @FindBy(id = "customer.address.street")
    protected WebElement streetInput;

    @FindBy(id = "customer.address.city")
    protected WebElement cityInput;

    @FindBy(id = "customer.address.state")
    protected WebElement stateInput;

    @FindBy(id = "customer.address.zipCode")
    protected WebElement zipCodeInput;

    @FindBy(id = "customer.phoneNumber")
    protected WebElement phoneNumberInput;

    @FindBy(id = "customer.ssn")
    protected WebElement ssnInput;

    @FindBy(id = "customer.username")
    protected WebElement usernameInput;

    @FindBy(id = "customer.password")
    protected WebElement passwordInput;

    @FindBy(id = "repeatedPassword")
    protected WebElement repeatedPasswordInput;

    @FindBy(xpath = "//input[@value='Register']")
    protected WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage openRegisterPage() {
        driver.get("http://parabank.parasoft.com/parabank/register.htm");
        return this;
    }

    public RegisterPage setFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public RegisterPage setLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public RegisterPage setStreet(String street) {
        streetInput.sendKeys(street);
        return this;
    }

    public RegisterPage setCity(String city) {
        cityInput.sendKeys(city);
        return this;
    }

    public RegisterPage setState(String state) {
        stateInput.sendKeys(state);
        return this;
    }

    public RegisterPage setZipCode(String zipCode) {
        zipCodeInput.sendKeys(zipCode);
        return this;
    }

    public RegisterPage setPhoneNumber(String phoneNumber) {
        phoneNumberInput.sendKeys(phoneNumber);
        return this;
    }

    public RegisterPage setSsn(String ssn) {
        ssnInput.sendKeys(ssn);
        return this;
    }

    public RegisterPage setUsername(String username) {
        usernameInput.sendKeys(username);
        return this;
    }

    public RegisterPage setPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public RegisterPage setRepeatedPassword(String repeatedPassword) {
        repeatedPasswordInput.sendKeys(repeatedPassword);
        return this;
    }

    public BasePage clickRegisterButton(boolean error) {
        registerButton.submit();
        BasePage page;
        if (!error) {
            page = new RegisterSummaryPage(driver);
        } else {
            page = new RegisterErrorPage(driver);
        }
        return page;
    }
}