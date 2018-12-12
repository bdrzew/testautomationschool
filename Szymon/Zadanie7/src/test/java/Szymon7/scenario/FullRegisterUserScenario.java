package Szymon7.scenario;

import Szymon7.User;
import Szymon7.page.WelcomePage;
import Szymon7.scenario.common.Scenario;

public class FullRegisterUserScenario implements Scenario <WelcomePage, WelcomePage> {

//    private User user = new User();

    @Override
    public WelcomePage run(WelcomePage welcomePage, User user) {
        return welcomePage
                .clickRegisterLink()
                .run(new FillRegisterWithCorrectUserScenario(user), user)
                .clickRegisterAndRedirect()
                .clickLogout();
    }
}