package Szymon_zadanie10.page.checkout;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingCheckoutStepPage extends BaseStorePage {
    @FindBy (xpath = "//button[@name='processCarrier']//span")
    private WebElement pProceedToCheckoutOnShipping;
    @FindBy (xpath = "//input[@id='cgv']")
    private WebElement agreeToTermsOfServiceField;

    public ShippingCheckoutStepPage(WebDriver driver) {
        super(driver);
    }

    public PaymentCheckoutStepPage clickProceedToCheckoutOnShipping() {
        waitUntil(p -> pProceedToCheckoutOnShipping.isDisplayed());
        pProceedToCheckoutOnShipping.click();
        return new PaymentCheckoutStepPage(driver);
    }

    public ShippingCheckoutStepPage agreeToTermsOfService() {
        agreeToTermsOfServiceField.click();
        return this;
    }
}
