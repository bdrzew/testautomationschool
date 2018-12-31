package Szymon_zadanie10.page.component;

import Szymon_zadanie10.assertion.HeaderComponentAssertion;
import Szymon_zadanie10.page.AuthenticationPage;
import Szymon_zadanie10.page.common.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class HeaderComponent extends Component {
    @FindBy(xpath = ".//div[@class='header_user_info']/a[@class='login']")
    private WebElement SignIn;
    @FindBy(xpath = ".//div[@class='header_user_info']/a[@class='logout']")
    private WebElement SignOut;
    @FindBy(xpath =  "//div[@class='header_user_info']/a[@class='account']/span")
    private WebElement firstAndLastNameField;
    @FindBy(css = ".sf-menu>li>a")
    private List<WebElement> mainCategories;
    @FindBy (css = ".sf-menu>li>ul")
    private List<WebElement> dressesCategories;
    @FindBy (xpath = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
    private WebElement dressesCategoriesField;

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

    public WebElement getFirstAndLastNameField() {
        return firstAndLastNameField;
    }


    public List<WebElement> getMainCategories() {
        return mainCategories;
    }

    public List<WebElement> getDressesCategories() {
        return dressesCategories;
    }

    public WebElement getDressesCategoriesField() {
        return dressesCategoriesField;
    }

    public HeaderComponent hoverOverDressesCategories() {
        Actions action = new Actions(driver);

        action.moveToElement(getDressesCategoriesField())
                .pause(5000)
                .build().perform();
        return this;
    }
}
