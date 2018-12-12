package Szymon7.page.accountServicesPage;

import Szymon7.page.common.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferFundsPage extends AccountServicesPage {
    @FindBy(xpath = "//input[@id='amount']")
    private WebElement amountField;


    public TransferFundsPage(WebDriver driver) {
        super(driver);
    }

    public TransferFundsPage enterAmountToTransfer(Integer amount) {
        amountField.sendKeys(amount.toString());
        return this;
    }


}
