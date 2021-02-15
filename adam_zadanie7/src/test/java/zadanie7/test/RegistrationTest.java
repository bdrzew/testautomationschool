package zadanie7.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import zadanie7.page.RegistrationPage;

public class RegistrationTest extends BeforeAfterTest {
    RegistrationPage registrationPage;

    @BeforeMethod
    public void beforeTest() {
        registrationPage = new RegistrationPage(driver);
    }

    @Test
    public void assertIfNameFieldIsRequired() {
        registrationPage.openRegistrationPage()
                .clickReg()
                .assertName("First name is required.");
    }
}

