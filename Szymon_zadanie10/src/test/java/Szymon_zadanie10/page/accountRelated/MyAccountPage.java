package Szymon_zadanie10.page.accountRelated;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BaseStorePage {
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
