package zadanie10.page.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import zadanie10.page.AuthenticationPage;
import zadanie10.page.LoginPage;
import zadanie10.page.common.Component;

public class HeaderComponent extends Component {
    @FindBy(xpath = ".//div[@class='header_user_info']/a[@class='login']")
    private WebElement SignIn;
    @FindBy (xpath = "//img[@class='logo img-responsive']")
    private WebElement homePageLogo;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public AuthenticationPage clickSignIn() {
        SignIn.click();
        return new AuthenticationPage(driver);
    }

    public LoginPage clickLoginPageLogo() {
        homePageLogo.click();
        return new LoginPage(driver);
    }
}
