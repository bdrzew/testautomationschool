package zadanie10.assertion;

import org.testng.asserts.Assertion;
import zadanie10.page.AuthenticationPage;
import zadanie10.page.common.MainPage;

import static org.testng.Assert.assertEquals;

public class AuthenticationPageAssertion extends Assertion <AuthenticationPage> {
    public AuthenticationPageAssertion verifyTextPresentInSignInErrorField(String textToVerify) {
        assertEquals(page.getSignInErrorField().getText(), textToVerify);
        return this;
    }
}
