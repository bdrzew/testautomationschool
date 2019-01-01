package Szymon_zadanie10.page.component;

import Szymon_zadanie10.page.common.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPopUpComponent extends Component {
    public AddToCartPopUpComponent(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@title='Continue shopping']//span")
    private WebElement continueShoppingButton;
    @FindBy (css = ".ajax_cart_quantity")
    private WebElement textNumberOfItemsInCartFromPopup;

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public ProductOptionsComponent continueShopping() {
        //Waiting for the popup to display
        //        waitUntil(p-> continueShoppingButton.isDisplayed()); < co tutaj trzeba zrobić żeby była dostępna metoda 'elementToBeClickable'
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton));
        continueShoppingButton.click();
        waitUntil(p-> !continueShoppingButton.isDisplayed());
        return new ProductOptionsComponent(driver);
    }

    public WebElement getTextNumberOfItemsInCartFromPopup() {
        waitUntil(p-> textNumberOfItemsInCartFromPopup.isDisplayed());
        return textNumberOfItemsInCartFromPopup;
    }
}
