package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartPage {
    private WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openStartPage() {
        driver.get("http://parabank.parasoft.com/");
    }
    public void openPage(String url) {
        driver.get(url);
    }

    public void maximizePage(){
        driver.manage().window().fullscreen();
    }

    public void setLogin(String login) {
        driver.findElement(By.cssSelector("[name=username]")).sendKeys(login);
    }

    public void setPassword(String password) {
        driver.findElement(By.cssSelector("[name=password]")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector(".login .button")).click();
    }

/*    public void clickRegisterButton() {
        driver.findElement(By.xpath(("//div[@id='loginPanel']/p[last()]/a"))).click();
    }*/
}

