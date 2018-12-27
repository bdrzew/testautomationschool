package Szymon_zadanie10.assertion;

import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.AuthenticationPage;

import static org.testng.Assert.assertEquals;

public class AuthenticationPageAssertion extends Assertion <AuthenticationPage> {
    public AuthenticationPageAssertion verifyTextPresent(String textToVerify) {
        assertEquals(page.getValidatorField().getText(), textToVerify);
        return this;
    }
}
