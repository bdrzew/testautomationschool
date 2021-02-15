package Szymon7.scenario;

import Szymon7.model.User;
import Szymon7.page.WelcomePage;
import Szymon7.scenario.common.Scenario;

public class FullRegisterUserScenario implements Scenario <WelcomePage, WelcomePage> {


    public FullRegisterUserScenario() {
        User user = new User();
    }

    @Override
    public WelcomePage run(WelcomePage welcomePage) {
        return welcomePage
                .clickRegisterLink()
                .run(new FillRegisterWithCorrectUserScenario(user))
                .clickRegisterAndRedirect()
                .clickLogout();
    }
}