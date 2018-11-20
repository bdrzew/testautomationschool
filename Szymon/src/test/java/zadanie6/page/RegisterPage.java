package zadanie6.page;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void enterFirstName(String firstName) {
        driver.findElement(By.id("customer.firstName")).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
    }

    public void enterAddress(String street) {
        driver.findElement(By.id("customer.address.street")).sendKeys(street);
    }

    public void enterCity(String city) {
        driver.findElement(By.id("customer.address.city")).sendKeys(city);
    }

    public void enterState(String state) {
        driver.findElement(By.id("customer.address.state")).sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
    }

    public void enterSsn(String ssn) {
        driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
    }

    public String getRandomUsername(int numberOfChars) {
        String randomString = RandomStringUtils.randomAlphanumeric(numberOfChars);
        String usernameIncoming = "user_" + randomString;
        return usernameIncoming;
    }

    public void enterUsername(String usernameIncoming) {
        driver.findElement(By.id("customer.username")).sendKeys(usernameIncoming);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("customer.password")).sendKeys(password);
    }

    public void confirmPasswordField(String password) {
        driver.findElement(By.id("repeatedPassword")).sendKeys(password);
    }

    public void clickRegisterButton() {
        driver.findElement(By.xpath(
                "//input[@value='Register']")).click();
    }

    public String getConfirmMessageText() {
        return driver.findElement(By.xpath("//div[@id='rightPanel']")).getText();
    }

    public void createRegularUser() {
        String password = "1";

        enterFirstName("Jan");
        enterLastName("Nowak");
        enterAddress("Sesame Street");
        enterCity("Kraków");
        enterState("Best State");
        enterZipCode("31-543");
        enterPhoneNumber("777888999");
        enterSsn("1234567890");
        String usernameIncoming = getRandomUsername(5);
        enterUsername(usernameIncoming);
        enterPassword(password);
        confirmPasswordField(password);
        clickRegisterButton();

        CreatedUsers.setCreatedUsername(usernameIncoming);                 //jak to zrobić
        CreatedUsers.setCreatedUsernamePassword(password);

    }

    public void clickLogout() {
        driver.findElement(By.xpath("//a[@href='/parabank/logout.htm']")).click();
    }
}

