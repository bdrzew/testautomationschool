package Szymon7.page;

import Szymon7.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class RegisterPage extends LeftNavigationMenu {

    @FindBy(id = "customer.firstName")
    private WebElement firstNameField;
    @FindBy(id = "customer.lastName")
    private WebElement lastNameField;
    @FindBy(id = "customer.address.street")
    private WebElement address;
    @FindBy(id = "customer.address.city")
    private WebElement cityField;
    @FindBy(id = "customer.address.state")
    private WebElement stateField;
    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCode;
    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneField;
    @FindBy(id = "customer.ssn")
    private WebElement ssnField;
    @FindBy(id = "customer.username")
    private WebElement usernameField;
    @FindBy(id = "customer.password")
    private WebElement passField;
    @FindBy(xpath = "//input[@value='Register']")
    private WebElement registerButton;
    @FindBy(id = "repeatedPassword")
    private WebElement passAgain;
    @FindBy(id = "repeatedPassword.errors")
    private WebElement repeatedPasswordErrorsText;
    @FindBy(id = "customer.username.errors")
    private WebElement userValidationText;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public RegisterPage enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        return this;
    }

    public RegisterPage enterAddress(String addressText) {
        address.sendKeys(addressText);
        return this;
    }

    public RegisterPage enterCity(String city) {
        cityField.sendKeys(city);
        return this;
    }

    public RegisterPage enterState(String state) {
        stateField.sendKeys(state);
        return this;
    }

    public RegisterPage enterZipCode(String zip) {
        zipCode.sendKeys(zip);
        return this;
    }

    public RegisterPage enterPhone(String phoneNo) {
        phoneField.sendKeys(phoneNo);
        return this;
    }

    public RegisterPage enterSSN(String ssn) {
        ssnField.sendKeys(ssn);
        return this;
    }

    public RegisterPage enterUsername(String user) {
        usernameField.sendKeys(user);
        return this;

    }
    /**
     * This method is only taking not setting user.
     * @return
     */
//    public RegisterPage enterTheSameUsernameAgain() {
//        usernameField.sendKeys(user.getUsername());
//        return this;
//    }

    public RegisterPage enterPassword(String secretPass) {
        passField.sendKeys(secretPass);
        return this;
    }

    public RegistrationConfirmationPage clickRegisterAndRedirect() {
        registerButton.click();
        return new RegistrationConfirmationPage(driver);
    }

    /**
     * This method is not like RegistrationConfirmationPage clickRegisterAndRedirect
     * because we need to assert negative results on RegisterPage
     * @return
     */
    public RegisterPage clickRegister() {
        registerButton.click();
        return this;
    }

    public RegisterPage enterPasswordAgain(String secretPass) {
        passAgain.sendKeys(secretPass);
        return this;
    }

    public WebElement getRepeatedPasswordErrorsText() {
        return repeatedPasswordErrorsText;
    }

    public WebElement getUserValidationText() {
        return userValidationText;
    }
}
