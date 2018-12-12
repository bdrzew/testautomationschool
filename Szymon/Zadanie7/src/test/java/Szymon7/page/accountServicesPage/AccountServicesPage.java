package Szymon7.page.accountServicesPage;

import Szymon7.page.common.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountServicesPage extends Page {
    @FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
    private WebElement findTransferFunds;
    @FindBy (xpath = "//input[@value='Transfer']")
    private WebElement transferButton;
    @FindBy (xpath = "//a[contains(text(),'Accounts Overview')]")
    private WebElement accountsOverviewLink;
    @FindBy (xpath = "//select[@id='fromAccountId']/*")
    private WebElement selection;

    public AccountServicesPage(WebDriver driver) {
        super(driver);
    }

    public TransferFundsPage clickTransferFundsLink() {
        findTransferFunds.click();
        if (selection.getText().equals("UNDEFINED"))
        {
            findTransferFunds.click();
        }

        //select[@id='fromAccountId']//option[@value='13566'][contains(text(),'13566')]
        return new TransferFundsPage(driver);
    }

    public TransferCompletePage clickTransferButtonAndRedirect() {
        transferButton.click();
        return new TransferCompletePage(driver);
    }

    public TransferFundsPage clickAccountsOverviewLink() {
        accountsOverviewLink.click();
        return new AccountsOverviewPage(driver);
    }
}
