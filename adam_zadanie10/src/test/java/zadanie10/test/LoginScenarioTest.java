package zadanie10.test;

import org.testng.annotations.Test;
import zadanie10.page.LoginPage;
import zadanie10.test.common.AutomationPractiseTest;

public class LoginScenarioTest extends AutomationPractiseTest {

    @Test

    public void loginTest(){
        new LoginPage(driver, "http://automationpractice.com/index.php")
                .run(new LoginScenario("adamm", "1234"))
                .clickLoginButton();
    }
}
