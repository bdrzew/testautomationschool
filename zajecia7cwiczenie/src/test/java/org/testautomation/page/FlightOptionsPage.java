package org.testautomation.page;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class FlightOptionsPage extends Page{

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> rows;

    @FindBy(xpath = "//tbody//tr[1]//td[1]//input[1]")
    private  WebElement button;

    public FlightOptionsPage(WebDriver driver) {
        super(driver);
    }

    public FlightOptionsPage checkNumberOfVisibleFlights(int numOfRows) {
        Assert.assertEquals(rows.size(), numOfRows);
        return this;
    }

    public TrawellerFormPage clickFlightButton(int rowNumber) {
        button.click();
        return new TrawellerFormPage(driver);

    }
}
