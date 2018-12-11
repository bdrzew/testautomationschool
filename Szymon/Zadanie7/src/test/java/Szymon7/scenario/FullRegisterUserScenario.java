package Szymon7.scenario;

import Szymon7.User;
import Szymon7.page.WelcomePage;
import Szymon7.scenario.common.Scenario;
import org.openqa.selenium.WebDriver;

public class FullRegisterUserScenario implements Scenario <WelcomePage, WelcomePage> {

    private WebDriver driver;
    private User user = new User();

    @Override
    public WelcomePage run(WelcomePage welcomePage) {
        new WelcomePage(driver, "http://parabank.parasoft.com")
                .clickRegisterLink()
                .run(new FillRegisterWithCorrectUserScenario(user))
                .clickRegisterAndRedirect()
                .clickLogout();
        return welcomePage;
    }
}