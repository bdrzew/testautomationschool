package school.testautomation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterSummaryPage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Welcome')]")
    private WebElement welcomeText;

    public RegisterSummaryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isUserLoggedIn() {
        return welcomeText.isDisplayed();
    }
}