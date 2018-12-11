package Szymon7.page;

import Szymon7.page.common.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class AccountServicesPage extends Page {
    @FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
    private WebElement findTransferFunds;

    public AccountServicesPage(WebDriver driver) {
        super(driver);
    }

    public TransferFundsPage clickTransferFundsLink() {
        findTransferFunds.click();
        return new TransferFundsPage(driver);
    }


}
