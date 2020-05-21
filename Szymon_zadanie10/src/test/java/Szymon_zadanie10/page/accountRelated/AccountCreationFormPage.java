package Szymon_zadanie10.page.accountRelated;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationFormPage extends BaseStorePage {
    @FindBy(id = "id_gender1")
    private WebElement titleMrField;
    @FindBy(id = "customer_firstname")
    private WebElement firstNameField;
    @FindBy(id = "customer_lastname")
    private WebElement lastNameField;
    @FindBy(id = "passwd")
    private WebElement enterPasswordField;
    @FindBy(id = "days")
    private WebElement selectDateOfBirthDay;
    @FindBy(id = "months")
    private WebElement selectDateOfBirthMonth;
    @FindBy(id = "years")
    private WebElement selectDateOfBirthYear;
    @FindBy(id = "address1")
    private WebElement enterAddress;
    @FindBy(id = "city")
    private WebElement enterCity;
    @FindBy(id = "id_state")
    private WebElement selectState;
    @FindBy(id = "postcode")
    private WebElement enterZipCode;
    @FindBy(id = "phone_mobile")
    private WebElement enterMobilePhone;
    @FindBy(id = "submitAccount")
    private WebElement button;

    public AccountCreationFormPage(WebDriver driver) {
        super(driver);
    }

    public AccountCreationFormPage selectTitleMr() {
        waitUntil(condition -> titleMrField.isDisplayed(), 10);
        titleMrField.click();
        return this;
    }

    public AccountCreationFormPage enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public AccountCreationFormPage enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        return this;
    }

    public AccountCreationFormPage enterPassword(String password) {
        enterPasswordField.sendKeys(password);
        return this;
    }


    public AccountCreationFormPage selectDateOfBirthDay(String birthDay) {
        new Select(selectDateOfBirthDay).selectByValue(birthDay);
        return this;
    }

    public AccountCreationFormPage selectDateOfBirthMonth(String birthMonth) {
        new Select(selectDateOfBirthMonth).selectByValue(birthMonth);
        return this;
    }

    public AccountCreationFormPage selectDateOfBirthYear(String birthYear) {
        new Select(selectDateOfBirthYear).selectByValue(birthYear);
        return this;
    }


    public AccountCreationFormPage enterAddress(String address) {
        enterAddress.sendKeys(address);
        return this;
    }


    public AccountCreationFormPage enterCity(String city) {
        enterCity.sendKeys(city);
        return this;
    }

    public AccountCreationFormPage selectState(String state) {
        new Select(selectState).selectByValue(state);
        return this;
    }

    public AccountCreationFormPage enterZipCode(String zipCode) {
        enterZipCode.sendKeys(zipCode);
        return this;
    }

    public AccountCreationFormPage enterMobilePhone(String MobilePhone) {
        enterMobilePhone.sendKeys(MobilePhone);
        return this;
    }

    public MyAccountPage clickRegisterButton() {
        button.click();
        return new MyAccountPage(driver);
    }
}
