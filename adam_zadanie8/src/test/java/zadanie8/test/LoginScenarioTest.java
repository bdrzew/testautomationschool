package zadanie8.test;

import org.testng.annotations.Test;
import zadanie8.page.LoginPage;
import zadanie8.test.common.StartBank;
import zadanie8.scenario.LoginScenario;

public class LoginScenarioTest extends StartBank {
@Test
    public void loginTest(){
new LoginPage(driver, "http://parabank.parasoft.com/")
        .run(new LoginScenario("adamm", "1234"))
        .clickLoginButton();
}
}
