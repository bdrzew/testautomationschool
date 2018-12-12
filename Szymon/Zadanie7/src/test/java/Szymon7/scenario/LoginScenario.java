package Szymon7.scenario;

import Szymon7.User;
import Szymon7.page.CustomerLoginPage;
import Szymon7.scenario.common.Scenario;

public class LoginScenario implements Scenario<CustomerLoginPage, CustomerLoginPage> {

    private User user;
    public LoginScenario (User user){
        this.user = user;
    }

    @Override
    public CustomerLoginPage run(CustomerLoginPage customerLoginPage, User user) {
        return customerLoginPage
                .enterUsername(this.user.getUsername())
                .enterPassword(this.user.getPassword())
                .clickLogIn();
    }
}
