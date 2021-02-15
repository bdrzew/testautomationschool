package Szymon7.assertion;

import Szymon7.assertion.common.Assertion;
import Szymon7.page.accountServicesPage.TransferCompletePage;

import static org.testng.Assert.assertEquals;

public class TransferCompleteAssertion extends Assertion<TransferCompletePage> {

    public TransferCompleteAssertion assertThatConfirmationTextIsPresent() {
        assertEquals(page.getTransferConfirmationText().getText(), "Transfer Complete!");
        return this;
    }
}
