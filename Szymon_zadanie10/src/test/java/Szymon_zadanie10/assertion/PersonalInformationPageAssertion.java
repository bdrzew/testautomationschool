package Szymon_zadanie10.assertion;

import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.PersonalInformationPage;

import static org.testng.Assert.assertEquals;

public class PersonalInformationPageAssertion extends Assertion <PersonalInformationPage> {
    public PersonalInformationPageAssertion verifyUserData(String email){
        assertEquals(page.getEmailField().getAttribute("value"), email, "Email is different or not found" );
        return this;
    }
}