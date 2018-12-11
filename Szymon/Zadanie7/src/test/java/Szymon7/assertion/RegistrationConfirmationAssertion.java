package Szymon7.assertion;

import Szymon7.User;
import Szymon7.assertion.common.Assertion;
import Szymon7.page.RegistrationConfirmationPage;

import static org.testng.Assert.assertEquals;

public class RegistrationConfirmationAssertion extends Assertion<RegistrationConfirmationPage> {

    public RegistrationConfirmationAssertion assertThatWelcomeTextForUserIsPresent(User user) {
        assertEquals(page.getHeadingWelcome().getText(),"Welcome "+ user.getUsername());
        return this;
    }
}
