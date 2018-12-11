package Szymon7.page;

import Szymon7.page.common.Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class TransferFundsPage extends Page {
    @FindBy(id = "amount")
    private WebElement amountField;
    @FindBy (xpath = "//input[@value='Transfer']")
    private WebElement transferButton;

    public TransferFundsPage(WebDriver driver) {
        super(driver);
    }

    public TransferFundsPage enterAmountToTransfer(Integer amount) {
        amountField.sendKeys(amount.toString());
        return this;
    }

    public TransferCompletePage clickTransferButtonAndRedirect() {
        transferButton.click();
        return new TransferCompletePage(driver);
    }
}
