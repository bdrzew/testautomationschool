package zadanie6.page;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage  extends  LeftNavigationMenu{
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        super(driver);
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
        return "user_" + randomString;
    }

    public void enterUsernameToRegisterForm(String usernameIncoming) {
        driver.findElement(By.id("customer.username")).sendKeys(usernameIncoming);
    }

    public void enterPasswordToRegisterForm(String password) {
        driver.findElement(By.id("customer.password")).sendKeys(password);
    }

    public void confirmPasswordField(String password) {
        driver.findElement(By.id("repeatedPassword")).sendKeys(password);
    }

    public String getConfirmMessageText() {
        return driver.findElement(By.xpath("//div[@id='rightPanel']")).getText();
    }




    private String password;
    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        username = getRandomUsername(5);
    }

    public void createRegularUser() {

        enterFirstName(getFirstName());
        enterLastName(getLastName());
        enterAddress("Sesame Street");
        enterCity("Kraków");
        enterState("Best State");
        enterZipCode("31-543");
        enterPhoneNumber("777888999");
        enterSsn("1234567890");

        setPassword("1");
        setUsername();

        enterUsernameToRegisterForm(getUsername());
        enterPasswordToRegisterForm(getPassword());
        confirmPasswordField(getPassword());
        clickRegisterButton();

    }

    public String getFirstName() {  //wiem, że nie tak
      return "Jan";
    }

    public String getLastName() {
        return "Nowak";
    }
}

