package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.PersonalInformationPageAssertion;
import Szymon_zadanie10.model.User;
import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.scenario.RegisterUserScenario;
import Szymon_zadanie10.test.common.SeleniumTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest extends SeleniumTest {
    private User user = new User();

    @BeforeMethod
    public void testSetup (){
        driver.navigate().to("http://automationpractice.com");
        user.setRandomEmail();
    }
    
    @Test
    public void registerUserSuccessfullyTest(){
        new FirstPage(driver)
                .run(new RegisterUserScenario(user))
                .clickMyPersonalInformation() // personalInformationPage
                .check(new PersonalInformationPageAssertion())
                .verifyUserData(user.getEmail());
    }
}