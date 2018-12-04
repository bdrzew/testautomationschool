package Szymon7.scenario;

import Szymon7.User;
import Szymon7.page.RegisterPage;
import Szymon7.page.RegistrationConfirmationPage;
import Szymon7.page.WelcomePage;
import Szymon7.scenario.common.Scenario;

public class RegisterCorrectUserScenario implements Scenario<WelcomePage, RegistrationConfirmationPage> {

    private User user;

    public RegisterCorrectUserScenario(User user){
    }
    @Override
    public RegistrationConfirmationPage run(WelcomePage welcomePage) {
        return welcomePage
                .clickRegisterLink()
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
                .enterPasswordAgain(user.getPasswordAgain())
                .clickRegisterAndRedirect();
    }
}