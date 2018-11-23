package org.testautomation.page;

import org.openqa.selenium.WebDriver;

public class TrawellerFormPage extends Page {

    public TrawellerFormPage(WebDriver driver) {
        super(driver);
    }

    public TrawellerFormPage setUserName(String name) {
        return this;
    }

    public OrderSummaryPage clickPurchaseFlight() {
        return new OrderSummaryPage(driver);
    }
}
