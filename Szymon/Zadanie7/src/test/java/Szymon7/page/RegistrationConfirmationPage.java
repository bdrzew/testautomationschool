package Szymon7.page;
import Szymon7.Users;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegistrationConfirmationPage extends LeftNavigationMenu {
    @FindBy(className = "title")
    private WebElement headingWelcome;

    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    private WebElement logoutLink;

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationConfirmationPage assertThatWelcomeTextForUserIsPresent() {
        assertEquals(headingWelcome.getText(),"Welcome "+ user.getUsername());
        return this;
    }

    public WelcomePage clickLogout() {
        logoutLink.click();
        return new WelcomePage(driver);
    }
}
