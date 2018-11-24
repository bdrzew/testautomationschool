package org.testautomation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class FlightOptionsPage extends Page{

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> rows;

    @FindBy(css = ".btn-small")
    private  List<WebElement> buttons;

    public FlightOptionsPage(WebDriver driver) {
        super(driver);
    }

    public FlightOptionsPage checkNumberOfVisibleFlights(int numOfRows) {
        Assert.assertEquals(rows.size(), numOfRows);
        return this;
    }

    public TrawellerFormPage clickFlightButton(int rowNumber) {
        buttons.get(rowNumber).click();
        return new TrawellerFormPage(driver);

    }
}
