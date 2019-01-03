package Szymon_zadanie10.page.common;

import Szymon_zadanie10.page.checkout.ShoppingCartSummaryPage;
import Szymon_zadanie10.page.product.ProductBlousePage;
import Szymon_zadanie10.page.component.AddToCartPopUpComponent;
import Szymon_zadanie10.page.component.ContextMenuComponent;
import Szymon_zadanie10.page.component.HeaderComponent;
import Szymon_zadanie10.page.component.ProductOptionsComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Objects;

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
        //Xpathy, jesli sa prametryzowane, to zrobmy z nich stałe
        //String xpathForItemAddButton = "//div[@itemscope][.//a[@title='" + itemTitle + "']]//a/span[contains(text(),'Add to cart')]";
        String xpathForItem = "//div[@itemscope][.//a[@title='" + itemTitle + "']]";

        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(xpathForItem)));

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(xpathForItem));
        action.moveToElement(we).moveToElement(driver.findElement(
                By.xpath(String.format(ADD_BUTTON_XPATH, itemTitle))))  //Xpathy, jesli sa prametryzowane, to zrobmy z nich stałe
                .click().build().perform();
        return new BaseStorePage(driver);
    }

    public BaseStorePage clickProductMoreButton(String productTitle) {
        String xpathForProductMoreButton = "//div[@itemscope][.//a[@title='" + productTitle + "']]//a/span[contains(text(),'More')]";
        String xpathForProduct = "//div[@itemscope][.//a[@title='" + productTitle + "']]";
        Actions action = new Actions(driver);

        WebElement we = driver.findElement(By.xpath(xpathForProduct));
        action.moveToElement(we).moveToElement(driver.findElement(
                By.xpath(xpathForProductMoreButton)))
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
