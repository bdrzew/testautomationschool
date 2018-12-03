package Szymon7.page;
import Szymon7.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.testng.Assert.assertEquals;


import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationConfirmationPage extends LeftNavigationMenu {
    @FindBy(className = "title")
    private WebElement headingWelcome;

    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    private WebElement logoutLink;

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public WelcomePage clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement asd = wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
        logoutLink.click();
        return new WelcomePage(driver);
    }

    public WebElement getHeadingWelcome() {
        return headingWelcome;
    }
}
