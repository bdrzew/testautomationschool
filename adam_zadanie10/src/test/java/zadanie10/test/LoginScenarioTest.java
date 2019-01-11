package zadanie10.test;

import org.testng.annotations.Test;
import zadanie10.Data.User1Data;
import zadanie10.assertion.AuthenticationPageAssertion;
import zadanie10.assertion.LoginAssertion;
import zadanie10.page.LoginPage;
import zadanie10.scenario.LoginScenario;
import zadanie10.test.common.AutomationPractiseTest;
import zadanie10.page.common.MainPage;
import zadanie10.page.component.HeaderComponent;

public class LoginScenarioTest extends AutomationPractiseTest {
    private User1Data user = new User1Data();

    @Test

    public void loginTest(){
        new LoginPage(driver)
                .getHeader()
                .clickSignIn()
                .enterEmailToLogin(user.getEmail())
                .enterPasswordToLogin("incorrectPassword")
                .clickLogIn()
                .check(new AuthenticationPageAssertion())
                .verifyAutheticationTextError;
                //.check(new LoginAssertion())
                //.run(new LoginScenario("testinhome@gmail.com", "12345"))
                //.clickLoginButton();
    }
}
