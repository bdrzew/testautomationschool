package Szymon_zadanie10.page.component;

import Szymon_zadanie10.page.AuthenticationPage;
import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.page.common.Component;
import Szymon_zadanie10.page.common.WomanCategoryPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Objects;

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

    protected WebElement findElementByText(List<WebElement> webElements, String text) {
        return webElements
                .stream()
                .filter(webElement -> Objects.equals(webElement.getText(), text))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No WebElement found containing " + text));
    }

    public HeaderComponent clickCategory(String category) {
        findElementByText(mainCategories, category).click();
        return this; //Haha ciekawe czy da się tu zrobić automatyczne przejście do Page taki jak category ;)
    }


    public WomanCategoryPage getWomanCategoryPage() {
        return new WomanCategoryPage(driver);
    }
}
