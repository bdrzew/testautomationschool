package Szymon7.test;

import Szymon7.User;
import Szymon7.assertion.RegisterAssertion;
import Szymon7.assertion.RegistrationConfirmationAssertion;
import Szymon7.scenario.RegisterCorrectUserScenario;
import Szymon7.test.common.SeleniumTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Szymon7.page.WelcomePage;

public class RegisterTest extends SeleniumTest {

    private User user = new User();

    @BeforeTest
    public void eachTestSetup(){
        user.setUsername();
    }

    @Test
    public void successfulRegistrationTest(){
        new WelcomePage(driver, "http://parabank.parasoft.com")
                    .run(new RegisterCorrectUserScenario(user))
                .check(RegistrationConfirmationAssertion.class)
                    .assertThatWelcomeTextForUserIsPresent(user);
    }

    @Test
    public void wrongPasswordRepeatedTest(){
        new WelcomePage (driver, "http://parabank.parasoft.com")
                .clickRegisterLink()
                .enterFirstName("Jan")
                .enterLastName("Nowak")
                .enterAddress("Nadwodnia 22")
                .enterCity("Kraków")
                .enterState("małopolska")
                .enterZipCode("34-400")
                .enterPhone("666222777")
                .enterSSN("123465")
//                .enterUsername(user)  //TODO
                .enterPassword("secretPass")
                .enterPasswordAgain("differentPass")
                .clickRegister()
                .check(RegisterAssertion.class)
                .assertThatPassValidationTextIsPresent();
    }

    @Test
    public void userAlreadyExistsTest(){
        new WelcomePage (driver, "http://parabank.parasoft.com")
                .clickRegisterLink()
                .enterFirstName("Jan")
                .enterLastName("Nowak")
                .enterAddress("Nadwodnia 22")
                .enterCity("Kraków")
                .enterState("małopolska")
                .enterZipCode("34-400")
                .enterPhone("666222777")
                .enterSSN("123465")
//                .enterUsername(user)      //TODO
                .enterPassword("secretPass")
                .enterPasswordAgain("secretPass")
                .clickRegisterAndRedirect()
                .clickLogout()
                .clickRegisterLink()
                .enterFirstName("Jan")
                .enterLastName("Nowak")
                .enterAddress("Nadwodnia 22")
                .enterCity("Kraków")
                .enterState("małopolska")
                .enterZipCode("34-400")
                .enterPhone("666222777")
                .enterSSN("123465")
//                .enterUsername(user)      //TODO
                .enterPassword("secretPass")
                .enterPasswordAgain("secretPass")
                .clickRegister()
                .check(RegisterAssertion.class)
                .assertThatUserValidationTextIsPresent();
    }
}

