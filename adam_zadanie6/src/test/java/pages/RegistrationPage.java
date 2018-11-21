package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage{
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {

        this.driver = driver;
    }
    public void openRegistrationPage() {
        driver.get("http://parabank.parasoft.com/parabank/register.htm");
    }

    public void setFirstName(String name) {
        driver.findElement(By.id("customer.firstName")).sendKeys(name);
    }

    public void setLastName(String lastName) {
        driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
    }

    public void setAddress(String address) {
        driver.findElement(By.id("customer.address.street")).sendKeys(address);
    }
    public void setCity(String city) {
        driver.findElement(By.id("customer.address.city")).sendKeys(city);
    }
    public void setState(String state) {
        driver.findElement(By.id("customer.address.state")).sendKeys(state);
    }

    public void setZipCode(String zipCode) {
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
    }

    public void setPhone(String phone) {
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(phone);
    }

    public void setSnn(String Snn) {
        driver.findElement(By.id("customer.ssn")).sendKeys(Snn);
    }

    public void setUsername(String username) {
        driver.findElement(By.id("customer.username")).sendKeys(username);
    }

    public void setPasswordReg(String passwordReg) {
        driver.findElement(By.id("customer.password")).sendKeys(passwordReg);
    }

    public void setConfirmPassword(String confirmPassword) {
        driver.findElement(By.id("repeatedPassword")).sendKeys(confirmPassword);
    }

    public void clickRegister() {
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }
    public String getFirstNameErrorDisplayed() {
        return driver.findElement(By.id("customer.firstName.errors")).getText();
    }
    public String getPassDidNotMatchErrorDisplayed() {
        return driver.findElement(By.id("repeatedPassword.errors")).getText();
    }
}
