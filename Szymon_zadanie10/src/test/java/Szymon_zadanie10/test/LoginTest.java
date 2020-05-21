package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.AuthenticationPageAssertion;
import Szymon_zadanie10.assertion.HeaderComponentAssertion;
import Szymon_zadanie10.model.User;
import Szymon_zadanie10.page.firstPage.FirstPage;
import Szymon_zadanie10.scenario.RegisterUserScenario;
import Szymon_zadanie10.scenario.SignInUserScenario;
import Szymon_zadanie10.test.common.SeleniumTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends SeleniumTest {

    private User user = new User();

    /*
     logowanie (po jednym pozytywnym i negatywnym przypadku) - sprawdzic nazwe uzytkownika w naglowku
     */
    @Test
    public void LoginSuccessTest (){
        new FirstPage(driver)
                .run(new SignInUserScenario(user))
                    .getHeaderComponent()
                .check(new HeaderComponentAssertion())
                    .verifyLoggedInUserByName(user.getFirstName()+" "+user.getLastName());
    }

    @Test
    public void LoginFailBecauseWrongPassword(){
        new FirstPage(driver)
                    .getHeaderComponent()
                        .clickSignIn()
                        .enterEmailToSignIn(user.getEmail())
                        .enterPasswordToSignIn("wrongPassword")
                        .clickSignInNoRedirect()
                .check(new AuthenticationPageAssertion())
                    .verifyTextPresentInSignInErrorField("Authentication failed.");
    }
}