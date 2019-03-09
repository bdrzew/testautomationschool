package zadanie10.scenario;

import zadanie10.Data.User1Data;
import zadanie10.page.LoginPage;
import zadanie10.page.common.Page;
import zadanie10.scenario.common.Scenario;

public class LogInScenario implements Scenario<LoginPage, LoginPage> {
    //private String email;
    //private String password;
    private User1Data user;

    public LogInScenario(User1Data user) {
        //this.email = email;
        //this.password = password;
        this.user = user;

    }

    @Override
    public LoginPage run(LoginPage loginPage) {
        return loginPage
                .getHeader()
                .clickSignIn()
                .enterEmail(user.getEmail())
                .enterPasswordToLogin(user.getPassword())
                .clickLogIn()
                .getHeader()
                .clickLoginPageLogo();

                //.selectEmail(email)
                //.selectPassword(password);
        //.clickLoginButton;

    }
}
