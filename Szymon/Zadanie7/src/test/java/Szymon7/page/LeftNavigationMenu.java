package Szymon7.page;

import Szymon7.page.common.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftNavigationMenu extends Page {

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement findRegisterButton;

    public LeftNavigationMenu(WebDriver driver) {
        super(driver);
    }

    public RegisterPage clickRegisterLink() {
        findRegisterButton.click();
        return new RegisterPage(driver);
    }

}
