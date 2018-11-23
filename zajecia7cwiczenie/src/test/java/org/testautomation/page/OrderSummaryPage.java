package org.testautomation.page;

import org.openqa.selenium.WebDriver;

public class OrderSummaryPage extends Page{

    public OrderSummaryPage(WebDriver driver) {
        super(driver);
    }

    public OrderSummaryPage assertTextIsPresent(String text) {
        return this;
    }
}
