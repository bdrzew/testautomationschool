package zadanie6.page;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends LeftNavigationMenu {

    private String password;
    private String username;
    private String firstName;
    private String lastName;
    private String addres;
    private String city;
    private String state;
    private String zipCode;
    private String PhoneNumber;
    private String ssn;

    public RegisterPage(WebDriver driver) {
        super(driver);
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {  //wiem, że nie tak
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        username = getRandomUsername(5);
    }

    public void createRegularUser() {
        openPage("http://parabank.parasoft.com/parabank/register.htm");

        setPassword("1");   //inicjalizację można by gdzieś indziej wypchnąć albo jakoś inaczej osobno zarządzać userami
        setUsername();
        setLastName("Nowak");
        setFirstName("Jan");
        setAddres("Sesame Street");
        setCity("Kraków");
        setState("Best State");
        setZipCode("31-543");
        setPhoneNumber("777888999");
        setSsn("1234567890");

        enterFirstName(getFirstName());
        enterLastName(getLastName());
        enterAddress(getAddres());
        enterCity(getCity());
        enterState(getState());
        enterZipCode(getZipCode());
        enterPhoneNumber(getPhoneNumber());
        enterSsn(getSsn());

        enterUsernameToRegisterForm(getUsername());
        enterPasswordToRegisterForm(getPassword());
        confirmPasswordField(getPassword());
        clickRegisterButton();
    }

}

