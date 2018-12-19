package zadanie10.scenario;

import zadanie10.page.LoginPage;
import zadanie10.page.common.Page;
import zadanie10.scenario.common.Scenario;

public class LoginScenario implements Scenario<LoginPage, LoginPage> {
    private String email;
    private String password;

    public LoginScenario(String email, String password) {
        this.email = email;
        this.password = password;

    }

    @Override
    public LoginPage run(LoginPage loginPage) {
        return loginPage
                .selectEmail(email)
                .selectPassword(password);
        //.clickLoginButton;

    }
}
