package Szymon7.scenario;

import Szymon7.model.User;
import Szymon7.page.RegisterPage;
import Szymon7.scenario.common.Scenario;

public class FillRegisterWithCorrectUserScenario implements Scenario<RegisterPage, RegisterPage> {

    private User user;

    public FillRegisterWithCorrectUserScenario(User user){
        this.user = user;
    }

    @Override
    public RegisterPage run(RegisterPage registerPage, User user) {
        return registerPage
                .enterFirstName(this.user.getFirstName())
                .enterLastName(this.user.getLastName())
                .enterAddress(this.user.getAddress())
                .enterCity(this.user.getCity())
                .enterState(this.user.getState())
                .enterZipCode(this.user.getZipCode())
                .enterPhone(this.user.getPhone())
                .enterSSN(this.user.getSSN())
                .enterUsername(this.user.getUsername())
                .enterPassword(this.user.getPassword())
                .enterPasswordAgain(this.user.getPasswordAgain());
    }
}