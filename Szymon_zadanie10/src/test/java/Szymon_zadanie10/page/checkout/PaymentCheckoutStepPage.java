package Szymon_zadanie10.page.checkout;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentCheckoutStepPage extends BaseStorePage {
    @FindBy (xpath = "//a[@title='Pay by bank wire']")
    private WebElement payByBankWire;

    public PaymentCheckoutStepPage(WebDriver driver) {
        super(driver);
    }

    public OrderSummaryCheckoutStepPage clickPayByBankWire() {
        waitUntil(p -> payByBankWire.isDisplayed());
        payByBankWire.click();
        return new OrderSummaryCheckoutStepPage(driver);
    }
}
