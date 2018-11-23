package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {

        this.driver = driver;
    }

    public void openRegistrationPage() {
        driver.get("http://parabank.parasoft.com/parabank/register.htm");
    }

    public void clickRegister() {
        driver.findElement(By.xpath("//input[@value='Register']")).click(); }

    public String getFirstNameErrorDisplayed() {
        return driver.findElement(By.id("customer.firstName.errors")).getText(); }

    public String getPasswordNotMatchErrorDisplayed() {
        return driver.findElement(By.xpath("//p[@class='error']")).getText();}
}

