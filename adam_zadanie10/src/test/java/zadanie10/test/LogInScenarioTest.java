package zadanie10.test;

import org.testng.annotations.Test;
import zadanie10.Data.User1Data;
import zadanie10.assertion.AuthenticationPageAssertion;
import zadanie10.assertion.LoginPageHeaderAssertion;
import zadanie10.page.LoginPage;
import zadanie10.scenario.LogInScenario;
import zadanie10.test.common.AutomationPractiseTest;


public class LogInScenarioTest extends AutomationPractiseTest {
    private User1Data user = new User1Data();

    @Test

    public void failedLoginTest() {
        new LoginPage(driver)
                .getHeader()
                .clickSignIn()
                .enterEmailToLogin(user.getEmail())
                .enterPasswordToLogin("incorrectPassword")
                .clickLogIn()
                .check(new AuthenticationPageAssertion())
                .verifyTextPresentInSignInErrorField("Authentication failed.");
    }

    @Test

    public void LoginTest() {
        new LoginPage(driver)
                .run(new LogInScenario(user))
                .getHeader()
                .check(new LoginPageHeaderAssertion());
                //.verifyLoggedUserName("");

    }
}
