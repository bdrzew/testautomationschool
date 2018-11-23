package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {
    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openStartPage() {
        driver.get("http://parabank.parasoft.com/"); }


    public void maximizePage() { driver.manage().window().fullscreen(); }
    public void setLogin(String login) {
        driver.findElement(By.cssSelector("[name=username]")).sendKeys(login);
    }
    public void setPassword(String password) { driver.findElement(By.cssSelector("[name=password]")).sendKeys(password); }
    public void clickLoginButton() {
        driver.findElement(By.cssSelector(".login .button")).click();
    }
    public String getEmptyUsernameErrorDisplayed() {
        return driver.findElement(By.xpath("//p[@class='error']")).getText();
    }
    public String getPassDidntMatchError() {
        return driver.findElement(By.xpath("//p[@class='error']")).getText();
    }
    public String getLoggedInUserDisplayed() {
        return driver.findElement(By.xpath("//p[@class='smallText']")).getText();
    }
}

