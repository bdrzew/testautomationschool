package Szymon_zadanie10.page;

import Szymon_zadanie10.page.common.AbstractStorePage;
import Szymon_zadanie10.page.common.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class MyAccountPage extends AbstractStorePage {
    @FindBy (xpath = "//a[@title='Information']")
    private WebElement myPersonalInformationButton;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public PersonalInformationPage clickMyPersonalInformation() {
        myPersonalInformationButton.click();
        return new PersonalInformationPage(driver);
    }
}
