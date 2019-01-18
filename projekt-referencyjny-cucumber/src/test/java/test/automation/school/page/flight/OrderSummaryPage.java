package test.automation.school.page.flight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPage extends AbstractFlightsPage {

    @FindBy(xpath = "//h1")
    private WebElement labelThankYou;

    public OrderSummaryPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getLabelThankYou() {
        return labelThankYou;
    }
}
