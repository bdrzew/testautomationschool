package Szymon_zadanie10.page.checkout;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class OrderConfirmationCheckoutStepPage extends BaseStorePage {
    @FindBy(xpath = "//span[@class='price']/strong")
    private WebElement amountField;
    @FindBy(xpath = "//div[@class='box']//br[2]/following-sibling::strong[1]")
    private WebElement accountOwnerField;

    public OrderConfirmationCheckoutStepPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAmountField() {
        waitUntil(p -> amountField.isDisplayed());
        return amountField;
    }

    public WebElement getAccountOwnerField() {
        return accountOwnerField;
    }
}
