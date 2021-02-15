package zadanie7.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

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
        assertEquals(headingWelcome.getText(),"Welcome "+new Users().getUsername());
        return this;
    }

    public WelcomePage clickLogout() {
        logoutLink.click();
        return new WelcomePage(driver);
    }
}
