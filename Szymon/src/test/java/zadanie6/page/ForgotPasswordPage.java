package zadanie6.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends LeftNavigationMenu{

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }


    public void enterFirstName(String firstName) {
        driver.findElement(By.id("firstName")).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(By.id("lastName")).sendKeys(lastName);
    }

    public void enterAddress(String addres) {
        driver.findElement(By.id("address.street")).sendKeys(addres);
    }

    public void enterCity(String city) {
        driver.findElement(By.id("address.city")).sendKeys(city);
    }

    public void enterState(String state) {
        driver.findElement(By.id("address.state")).sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        driver.findElement(By.id("address.zipCode")).sendKeys(zipCode);
    }

    public void enterSSN(String ssn) {
        driver.findElement(By.id("ssn")).sendKeys(ssn);
    }
    public void clickFindMyLogin() {
        driver.findElement(By.xpath("//input[@value='Find My Login Info']")).click();
    }

    public String getConfirmationText() {
        return null;
    }

    public String getUsernameText() {
        return null;
    }

    public String getPasswordText() {
        return null;
    }
}
