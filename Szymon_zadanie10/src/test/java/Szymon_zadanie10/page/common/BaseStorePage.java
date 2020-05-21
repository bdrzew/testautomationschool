package Szymon_zadanie10.page.common;

import Szymon_zadanie10.page.checkout.ShoppingCartSummaryPage;
import Szymon_zadanie10.page.product.ProductBlousePage;
import Szymon_zadanie10.page.component.AddToCartPopUpComponent;
import Szymon_zadanie10.page.component.ContextMenuComponent;
import Szymon_zadanie10.page.component.HeaderComponent;
import Szymon_zadanie10.page.component.ProductOptionsComponent;
import Szymon_zadanie10.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseStorePage extends Page {
    private HeaderComponent header;
    private ProductOptionsComponent productOptionsComponent;
    private AddToCartPopUpComponent addToCartPopUpComponent;
    private ContextMenuComponent contextMenuComponent;
    @FindBy(xpath = "//span[@title='Continue shopping']//span")
    private WebElement continueShoppingButton;
    @FindBy(css = ".ajax_cart_quantity")
    private WebElement textNumberOfItemsInCartFromPopup;
    @FindBy (xpath = "//a[@title='Proceed to checkout']//span")
    private WebElement proceedToCheckout;

    // Xpathy, jesli sa prametryzowane, to zrobmy z nich stałe
    private final static String ADD_BUTTON_XPATH = "//div[@itemscope][.//a[@title='%s']]//a/span[contains(text(),'Add to cart')]";
    private final static String XPATH_FOR_ITEM = "//div[@itemscope][.//a[@title='%s']]";
    private final static String XPATH_FOR_PRODUCT_MORE_BUTTON = "//div[@itemscope][.//a[@title='%s']]//a/span[contains(text(),'More')]";


    public BaseStorePage(WebDriver driver) {
        super(driver);
        header = new HeaderComponent(driver);
        productOptionsComponent = new ProductOptionsComponent(driver);
        addToCartPopUpComponent = new AddToCartPopUpComponent(driver);
        contextMenuComponent = new ContextMenuComponent(driver);
    }

    public HeaderComponent getHeaderComponent() {
        return header;
    }

    public ProductOptionsComponent getProductOptionsComponent() {
        return productOptionsComponent;
    }

    public AddToCartPopUpComponent getAddToCartPopUpComponent() {
        return addToCartPopUpComponent;
    }

    public ContextMenuComponent getContextMenuComponent() {
        return contextMenuComponent;
    }

    public ProductBlousePage getProductBlousePage() {
        return new ProductBlousePage(driver);
    }

    public BaseStorePage continueShopping() {
        //Waiting for the popup to display
        waitUntil(ExpectedConditions.elementToBeClickable(continueShoppingButton));
        continueShoppingButton.click();
        waitUntil(p -> !continueShoppingButton.isDisplayed());
        return new BaseStorePage(driver);
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public BaseStorePage addToCart(String itemTitle) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(String.format(XPATH_FOR_ITEM, itemTitle))));
//        powyższe nie działa na Firefox, gdy zamienimy na poniższe
//        waitUntil(ExpectedConditions.elementToBeClickable(By.id(String.format(XPATH_FOR_ITEM, itemTitle))));

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(String.format(XPATH_FOR_ITEM, itemTitle)));

        Utilities.javaScriptScroolView(driver, we);
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath(String.format(ADD_BUTTON_XPATH, itemTitle))))
        .click().build().perform();
        return new BaseStorePage(driver);
    }

    public BaseStorePage clickProductMoreButton(String itemTitle) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(String.format(XPATH_FOR_ITEM, itemTitle)));
        Utilities.javaScriptScroolView(driver, we);
        action.moveToElement(we).moveToElement(driver.findElement(
                By.xpath(String.format(XPATH_FOR_PRODUCT_MORE_BUTTON, itemTitle))))
                .click().build().perform();
        return this;
    }

    public WebElement getTextNumberOfItemsInCartFromPopup() {
        waitUntil(p -> textNumberOfItemsInCartFromPopup.isDisplayed());
        return textNumberOfItemsInCartFromPopup;
    }

    public ShoppingCartSummaryPage clickProceedToCheckoutOnPopup() {
        waitUntil(p -> proceedToCheckout.isDisplayed());
        proceedToCheckout.click();
        return new ShoppingCartSummaryPage(driver);
    }
}
