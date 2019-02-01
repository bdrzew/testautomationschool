package test.automation.school.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.automation.school.web.page.common.Page;

public class LeadDetailsPage extends Page {

    @FindBy(xpath = "//span[contains(@class,'lead-status')]")
    private WebElement leadStatus;

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLeadStatus() {
        return leadStatus;
    }
}
