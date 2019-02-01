package test.automation.school.web.page.login.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.automation.school.web.page.common.Component;

public class HeaderComponent extends Component {
    @FindBy(css = "a.navbar-brand")
    WebElement blazeDemoLink;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

}
