package zadanie10.test;

import org.testng.annotations.Test;
import zadanie10.assertion.LoginAssertion;
import zadanie10.page.LoginPage;
import zadanie10.scenario.LoginScenario;
import zadanie10.test.common.AutomationPractiseTest;

public class LoginScenarioTest extends AutomationPractiseTest {

    @Test

    public void loginTest(){
        new LoginPage(driver, "http://automationpractice.com/index.php?controller=authentication&back=my-account");
                //.check(new LoginAssertion())
                //.run(new LoginScenario("testinhome@gmail.com", "12345"))
                //.clickLoginButton();
    }
}
