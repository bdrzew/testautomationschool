package Szymon7.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.testng.Assert.assertEquals;


import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationConfirmationPage extends CustomerLoginPage {
    @FindBy(className = "title")
    private WebElement headingWelcome;

    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    private WebElement logoutLink;

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public WelcomePage clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
        // mam tu problem, jak puszczam wszystkie testy to nie przechodzi
        // a jak jeden to zawsze dziala :|
        // Bartku, jak żyć?
        return new WelcomePage(driver);
    }

    public WebElement getHeadingWelcome() {
        return headingWelcome;
    }
}