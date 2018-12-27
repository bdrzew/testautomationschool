package Szymon_zadanie10.page.component;

import Szymon_zadanie10.page.AuthenticationPage;
import Szymon_zadanie10.page.common.AbstractStorePage;
import Szymon_zadanie10.page.common.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends Component {
    @FindBy(xpath = ".//div[@class='header_user_info']/a[@class='login']")
    private WebElement SignIn;
    @FindBy(xpath = ".//div[@class='header_user_info']/a[@class='logout']\n")
    private WebElement SignOut;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public AuthenticationPage clickSignIn() {
        SignIn.click();
        return new AuthenticationPage(driver);
    }

    public AuthenticationPage clickSignOut() {
        SignOut.click();
        return new AuthenticationPage(driver);
    }
}
