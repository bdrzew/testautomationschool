package org.testautomation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravellerFormPage extends Page {

    @FindBy(id = "inputName")
    private WebElement name;

    @FindBy(xpath = "//input[@value='Purchase Flight']")
    private WebElement purchaseFlightButton;

    public TravellerFormPage(WebDriver driver) {
        super(driver);
    }

    public TravellerFormPage setUserName(String textName) {
        name.sendKeys(textName);
        return this;
    }

    public OrderSummaryPage clickPurchaseFlight() {
        purchaseFlightButton.click();
        return new OrderSummaryPage(driver);
    }
}
