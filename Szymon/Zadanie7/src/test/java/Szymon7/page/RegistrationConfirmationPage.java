package Szymon7.page;
import Szymon7.Users;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.testng.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationConfirmationPage extends LeftNavigationMenu {
    @FindBy(className = "title")
    private WebElement headingWelcome;

    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    private WebElement logoutLink;

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationConfirmationPage assertThatWelcomeTextForUserIsPresent(Users user) {
        assertEquals(headingWelcome.getText(),"Welcome "+ user.getUsername());
        return this;
    }

    public WelcomePage clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement asd = wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
        logoutLink.click();
        return new WelcomePage(driver);
    }
}
