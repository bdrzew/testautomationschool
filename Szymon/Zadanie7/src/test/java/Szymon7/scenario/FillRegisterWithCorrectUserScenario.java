package Szymon7.scenario;

import Szymon7.User;
import Szymon7.page.RegisterPage;
import Szymon7.page.RegistrationConfirmationPage;
import Szymon7.page.WelcomePage;
import Szymon7.scenario.common.Scenario;

public class FillRegisterWithCorrectUserScenario implements Scenario<RegisterPage, RegisterPage> {

    private User user;

    public FillRegisterWithCorrectUserScenario(User user){
        this.user = user;
    }

    @Override
    public RegisterPage run(RegisterPage registerPage) {
        return registerPage
                .enterFirstName(user.getFirstName())
                .enterLastName(user.getLastName())
                .enterAddress(user.getAddress())
                .enterCity(user.getCity())
                .enterState(user.getState())
                .enterZipCode(user.getZipCode())
                .enterPhone(user.getPhone())
                .enterSSN(user.getSSN())
                .enterUsername(user.getUsername())
                .enterPassword(user.getPassword())
                .enterPasswordAgain(user.getPasswordAgain());
    }
}