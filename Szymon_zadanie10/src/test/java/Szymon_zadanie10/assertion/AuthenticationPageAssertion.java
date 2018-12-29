package Szymon_zadanie10.assertion;

import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.AuthenticationPage;

import static org.testng.Assert.assertEquals;

public class AuthenticationPageAssertion extends Assertion <AuthenticationPage> {
    public AuthenticationPageAssertion verifyTextPresentInCreateErrorField(String textToVerify) {
        assertEquals(page.getCreateErrorField().getText(), textToVerify);
        return this;
    }

    public AuthenticationPageAssertion verifyTextPresentInSignInErrorField(String textToVerify) {
        assertEquals(page.getSignInErrorField().getText(), textToVerify);
        return this;
    }
}
