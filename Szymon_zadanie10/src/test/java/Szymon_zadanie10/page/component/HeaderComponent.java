package Szymon_zadanie10.page.component;

import Szymon_zadanie10.page.category.DressesCategoryPage;
import Szymon_zadanie10.page.category.TShirtCategoryPage;
import Szymon_zadanie10.page.category.WomanCategoryPage;
import Szymon_zadanie10.page.checkout.ShoppingCartSummaryPage;
import Szymon_zadanie10.page.common.BaseStorePage;
import Szymon_zadanie10.page.common.Component;
import Szymon_zadanie10.page.accountRelated.AuthenticationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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
    @FindBy (xpath = "//li[@class='sfHover']//ul[@class='submenu-container clearfix first-in-line-xs']/li/a")
    private List<WebElement> dressesCategoriesList; //to do listy
    @FindBy (xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
    private WebElement dressesMainCategoryField; //to tylko do hovera
    @FindBy (xpath = "//b[contains(text(),'Cart')]")
    private WebElement cartField;

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

    public List<WebElement> getDressesCategoriesList() {
        waitUntil(p -> !dressesCategoriesList.isEmpty());
        return dressesCategoriesList;
    }

    public WebElement getDressesMainCategoryField() {
        return dressesMainCategoryField;
    }

    public HeaderComponent hoverOverDressesCategories() {
        Actions action = new Actions(driver);

        action.moveToElement(getDressesMainCategoryField())
                .build().perform();
        return this;
    }

    public HeaderComponent clickCategory(String category) {
        BaseStorePage probablyCouldBeBetter = new BaseStorePage(driver);
        probablyCouldBeBetter.findElementByText(mainCategories, category).click();
        return this;
    }

    public WomanCategoryPage getWomanCategoryPage() {
        return new WomanCategoryPage(driver);
    }

    public DressesCategoryPage getDressesCategoryPage() {
        return new DressesCategoryPage(driver);
    }

    public TShirtCategoryPage getTShirtCategoryPage() {
        return new TShirtCategoryPage(driver);
    }

    public ShoppingCartSummaryPage clickCartField() {
        cartField.click();
        return new ShoppingCartSummaryPage(driver);
    }
}
