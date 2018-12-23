package Szymon_zadanie10.page;

import Szymon_zadanie10.page.common.AbstractStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformationPage extends AbstractStorePage {
    @FindBy (id = "email")
    private WebElement emailField;

    public PersonalInformationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField() {
        return emailField;
    }
}
