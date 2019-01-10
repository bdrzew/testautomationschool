package zadanie10.page.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import zadanie10.page.AuthenticationPage;
import zadanie10.page.common.Component;

public class HeaderComponent extends Component {
    @FindBy(xpath = ".//div[@class='header_user_info']/a[@class='login']")
    private WebElement SignIn;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public AuthenticationPage clickSignIn() {
        SignIn.click();
        return new AuthenticationPage(driver);
    }
}
