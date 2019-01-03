package Szymon_zadanie10.scenario;

import Szymon_zadanie10.model.User;
import Szymon_zadanie10.page.accountRelated.MyAccountPage;
import Szymon_zadanie10.page.firstPage.FirstPage;
import Szymon_zadanie10.scenario.common.Scenario;

public class SignInUserScenario implements Scenario<FirstPage, FirstPage> {

    private User user;

    public SignInUserScenario(User user) {
        this.user = user;
    }

    @Override
    public FirstPage run(FirstPage firstPage) {
        return firstPage
                .getHeaderComponent()
                    .clickSignIn()
                    .enterEmailToSignIn(user.getEmail())
                    .enterPasswordToSignIn(user.getPassword())
                    .clickSignInAndRedirect()
                .getHeaderComponent()
                    .clickHomePageLogo();
    }
}
