package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.AuthenticationPageAssertion;
import Szymon_zadanie10.assertion.PersonalInformationPageAssertion;
import Szymon_zadanie10.model.User;
import Szymon_zadanie10.page.AuthenticationPage;
import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.scenario.RegisterUserScenario;
import Szymon_zadanie10.test.common.SeleniumTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends SeleniumTest {
    private User user = new User();

    @BeforeMethod
    public void testSetup (){
        driver.navigate().to("http://automationpractice.com");
    }
    
    @Test
    public void registerUserSuccessfullyTest(){
        user.generateUser();
        new FirstPage(driver)
                .run(new RegisterUserScenario(user))
                    .clickMyPersonalInformation()
                .check(new PersonalInformationPageAssertion())
                    .verifyUserData(user.getEmail());
    }
    @Test
    public void registerAlreadyRegisteredUserTest(){
        user.generateUser();
        new FirstPage(driver)
                .run(new RegisterUserScenario(user))
                    .getHeaderComponent()
                    .clickSignOut()
                    .enterEmailCreate(this.user.getEmail())
                    .clickCreateAnAccountButton()
                .check(new AuthenticationPageAssertion())
                    .verifyTextPresent("An account using this email address has already been registered. Please enter a valid password or request a new one. ");


    }
}