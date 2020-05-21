package Szymon_zadanie10.page.checkout;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryCheckoutStepPage extends BaseStorePage {
    @FindBy (xpath = "//p[@id='cart_navigation']//span")
    private WebElement iConfirmMyOrder;

    public OrderSummaryCheckoutStepPage(WebDriver driver) {
        super(driver);
    }

    public OrderConfirmationCheckoutStepPage clickIConfirmMyOrder() {
        waitUntil(p -> iConfirmMyOrder.isDisplayed());
        iConfirmMyOrder.click();
        return new OrderConfirmationCheckoutStepPage(driver);
    }
}
