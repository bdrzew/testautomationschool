package zadanie10.scenario;

import zadanie10.Data.User1Data;
import zadanie10.page.LoginPage;
import zadanie10.page.common.Page;
import zadanie10.scenario.common.Scenario;

public class LogInScenario implements Scenario<LoginPage, LoginPage> {
    //private String email;
    //private String password;
    private User user;

    public LogInScenario(String email, String password) {
        //this.email = email;
        //this.password = password;
        this.user = user;

    }

    @Override
    public LoginPage run(LoginPage loginPage) {
        return loginPage
                .getHeader()
                .clickSignIn(User1Data.email)
                .enterEmail()
                .enerPassword()
                .clickLogin();
                //.selectEmail(email)
                //.selectPassword(password);
        //.clickLoginButton;

    }
}
