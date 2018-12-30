package zadanie10.assertion;

import zadanie10.assertion.common.Assertion;
import zadanie10.page.LoginPage;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;


public class LoginAssertion extends Assertion<LoginPage> {

    public  LoginAssertion IsLoginPageIsLoaded() {
        //assertTrue(page.waitUntil(condition -> page.getEmail().isDisplayed());

    }
}
