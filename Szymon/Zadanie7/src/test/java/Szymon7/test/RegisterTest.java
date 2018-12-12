package Szymon7.test;

import Szymon7.User;
import Szymon7.assertion.RegisterAssertion;
import Szymon7.assertion.RegistrationConfirmationAssertion;
import Szymon7.scenario.FillRegisterWithCorrectUserScenario;
import Szymon7.test.common.SeleniumTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Szymon7.page.WelcomePage;

public class RegisterTest extends SeleniumTest {

    private User user = new User();

    @BeforeMethod
    public void eachTestSetup(){
        user.setUsername();
    }

    @Test
    public void successfulRegistrationTest(){
        new WelcomePage(driver, "http://parabank.parasoft.com", user)
                .clickRegisterLink()
                    .run(new FillRegisterWithCorrectUserScenario(user), user)
                .clickRegisterAndRedirect()
                .check(new RegistrationConfirmationAssertion())
                    .assertThatWelcomeTextForUserIsPresent(user);
    }

    @Test
    public void wrongPasswordRepeatedTest(){
        new WelcomePage (driver, "http://parabank.parasoft.com", user)
                .clickRegisterLink()
                .enterFirstName(user.getFirstName())
                .enterLastName(user.getLastName())
                .enterAddress(user.getAddress())
                .enterCity(user.getCity())
                .enterState(user.getState())
                .enterZipCode(user.getZipCode())
                .enterPhone(user.getPhone())
                .enterSSN(user.getSSN())
                .enterUsername(user.getUsername())
                .enterPassword(user.getPassword())
                .enterPasswordAgain("differentPass")
                .clickRegister()
                .check(new RegisterAssertion())
                .assertThatPassValidationTextIsPresent();
    }

    @Test
    public void userAlreadyExistsTest(){
        new WelcomePage (driver, "http://parabank.parasoft.com", user)
                .clickRegisterLink()
                    .run(new FillRegisterWithCorrectUserScenario(user), user)
                .clickRegisterAndRedirect()
                .clickLogout()
                .clickRegisterLink()
                    .run(new FillRegisterWithCorrectUserScenario(user), user)
                .clickRegister()
                .check(new RegisterAssertion())
                .assertThatUserValidationTextIsPresent();
    }
}