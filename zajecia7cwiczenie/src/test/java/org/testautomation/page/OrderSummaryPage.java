package org.testautomation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class OrderSummaryPage extends Page {

    @FindBy(xpath = "//h1")
    private WebElement labelThankYou;

    public OrderSummaryPage(WebDriver driver) {
        super(driver);
    }

    public OrderSummaryPage assertTextIsPresent(String text) {
        assertTrue(labelThankYou.getText().contains(text), "There is no text "+text);
        return this;
    }
}
