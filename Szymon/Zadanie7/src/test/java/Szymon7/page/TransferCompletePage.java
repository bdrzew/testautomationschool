package Szymon7.page;

import Szymon7.page.common.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class TransferCompletePage extends Page {

    @FindBy (xpath = "//h1[@class='title']")
    private WebElement userValidationText;

    public TransferCompletePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTransferConfirmationText() {
        return userValidationText;
    }
}
