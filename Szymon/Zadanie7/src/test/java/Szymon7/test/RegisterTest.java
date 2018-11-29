package Szymon7.test;

import Szymon7.Users;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Szymon7.page.WelcomePage;

public class RegisterTest extends SeleniumTest {

    private Users user = new Users();


    @BeforeTest
    public void eachTestSetup(){
        user.setUsername();
    }

    @Test
    public void successfulRegistrationTest(){
        new WelcomePage(driver, "http://parabank.parasoft.com")
                .clickRegisterLink()
                .enterFirstName("Jan")
                .enterLastName("Nowak")
                .enterAddress("Nadwodnia 22")
                .enterCity("Kraków")
                .enterState("małopolska")
                .enterZipCode("34-400")
                .enterPhone("666222777")
                .enterSSN("123465")
                .enterUsername(user)
                .enterPassword("secretPass")
                .enterPasswordAgain("secretPass")
                .clickRegisterAndRedirect()
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
                .enterUsername(user)
                .enterPassword("secretPass")
                .enterPasswordAgain("differentPass")
                .clickRegister()
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
                .enterUsername(user)
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
                .enterUsername(user)
                .enterPassword("secretPass")
                .enterPasswordAgain("secretPass")
                .clickRegister()
                .assertThatUserValidationTextIsPresent();
    }
}

