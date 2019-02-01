package test.automation.school.web.page;

import org.openqa.selenium.WebDriver;
import test.automation.school.web.page.common.Page;
import test.automation.school.web.page.login.component.HeaderComponent;

public class SalesPage extends Page {
    public SalesPage(WebDriver driver) {
        super(driver);
    }

    public HeaderComponent getHeaderComponent() {
        return new HeaderComponent(driver);
    }
}
