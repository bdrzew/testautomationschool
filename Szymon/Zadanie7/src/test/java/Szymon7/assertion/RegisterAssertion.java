package Szymon7.assertion;

import Szymon7.page.RegisterPage;

import static org.testng.Assert.assertEquals;

public class RegisterAssertion extends Assertion<RegisterPage> {

    public RegisterAssertion assertThatPassValidationTextIsPresent() {
        assertEquals(page.getRepeatedPasswordErrorsText().getText(), "Passwords did not match.");
        return this;
    }

    public RegisterAssertion assertThatUserValidationTextIsPresent() {
        assertEquals(page.getUserValidationText().getText(), "This username already exists.");
        return this;
    }

}
