package zadanie7.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import zadanie7.page.LoginPage;
import zadanie7.page.RegistrationPage;

public class RegistrationTest extends BeforeAfterTest {

    @Test
    public void assertIfNameFieldIsRequired() {
        new RegistrationPage(driver, "http://parabank/register.htm")
                .clickReg()
        //new RegistrationPage(driver, "http://parabank/register.htm")
                .assertName("First name is required.");
    }

    @Test
    public void assertIfPasswordFieldsDidNotMatch() {
        new RegistrationPage(driver, "http://parabank/register.htm")
                .setLogin("adamm")
                .setPassword("1234")
                .clickLoginButton()
                .assertPasswordNotMatch("The username and password could not be verified.");
    }
}

