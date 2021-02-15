package zadanie8.scenario;

import zadanie8.page.LoginPage;
import zadanie8.scenario.common.Scenario;

public class LoginScenario implements Scenario<LoginPage, LoginPage> {
    private String username;
    private String password;

    public LoginScenario(String username, String password) {
        this.username = username;
        this.password = password;

    }

    @Override
    public LoginPage run(LoginPage loginPage) {
        return loginPage
                .selectUsername(username)
                .selectPassword(password);
                //.clickLoginButton;

    }
}
