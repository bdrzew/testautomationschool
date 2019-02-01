package test.automation.school.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.automation.school.rest.model.Lead;
import test.automation.school.web.page.common.Page;

public class LeadsPage extends Page {
    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    public LeadDetailsPage clickLeadWithText(Lead lead) {
        driver.findElement(By.xpath("//span[contains(text(),'" + lead.getData().getFirstName() + "')]")).click();
        return new LeadDetailsPage(driver);
    }
}
