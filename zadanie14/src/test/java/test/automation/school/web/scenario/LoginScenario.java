package test.automation.school.web.scenario;

import test.automation.school.web.page.SalesPage;
import test.automation.school.web.page.login.LoginPage;
import test.automation.school.web.scenario.common.Scenario;

public class LoginScenario implements Scenario <LoginPage, SalesPage> {

    private String username;
    private String password;

    public LoginScenario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public SalesPage run(LoginPage loginPage) {
        return loginPage
                .enterUsername(username)
                .enterPassword(password)
                .clickLoginButton();
    }
}
