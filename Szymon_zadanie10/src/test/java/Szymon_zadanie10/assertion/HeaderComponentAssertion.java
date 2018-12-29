package Szymon_zadanie10.assertion;

import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.component.HeaderComponent;

import static org.testng.Assert.assertEquals;

public class HeaderComponentAssertion extends Assertion<HeaderComponent> {

    public HeaderComponentAssertion verifyLoggedInUserByName(String firstAndLastName) {
        assertEquals(page.getFirstAndLastNameField().getText(), firstAndLastName);
        return this;
    }
}
