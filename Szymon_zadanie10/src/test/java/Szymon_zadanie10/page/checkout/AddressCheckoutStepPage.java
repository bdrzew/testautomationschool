package Szymon_zadanie10.page.checkout;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressCheckoutStepPage extends BaseStorePage {
    @FindBy(xpath = "//button[@name='processAddress']//span")
    private WebElement proceedToCheckoutOnAddress;

    public AddressCheckoutStepPage(WebDriver driver) {
        super(driver);
    }

    public ShippingCheckoutStepPage clickProceedToCheckoutOnAddress() {
        waitUntil(p -> proceedToCheckoutOnAddress.isDisplayed());
        proceedToCheckoutOnAddress.click();
        return new ShippingCheckoutStepPage(driver);
    }
}
