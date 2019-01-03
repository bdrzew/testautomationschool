package Szymon_zadanie10.assertion;

import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.checkout.OrderConfirmationCheckoutStepPage;

import static org.testng.Assert.assertEquals;

public class OrderConfirmationCheckoutStepPageAssertion extends Assertion<OrderConfirmationCheckoutStepPage> {
    public OrderConfirmationCheckoutStepPageAssertion verifyAmount(String amountExpected) {
        assertEquals(page.getAmountField().getText(), amountExpected);
        return this;
    }

    public OrderConfirmationCheckoutStepPageAssertion verifyAccountOwner(String accountOwnerExpected) {
        assertEquals(page.getAccountOwnerField().getText(), accountOwnerExpected);
        return this;
    }
}
