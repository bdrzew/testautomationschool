package zadanie6.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftNavigationMenu {

    protected WebDriver driver;

    public LeftNavigationMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void clickRegisterButton() {
        driver.findElement(By.xpath(
                "//input[@value='Register']")).click();
    }

    public void clickLogout() {
        driver.findElement(By.xpath(
                "//a[@href='/parabank/logout.htm']")).click();
    }

    public void enterUsername(String input) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(input);
    }

    public void enterPassword(String input) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(input);
    }

    public void clickLogin() {
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}
