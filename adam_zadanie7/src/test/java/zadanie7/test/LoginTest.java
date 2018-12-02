package zadanie7.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import zadanie7.page.LoginPage;

public class LoginTest extends BeforeAfterTest {
    LoginPage loginPage;

    @BeforeMethod
    public void start() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void checkIfUserIsLogin() {
        loginPage.openLoginPage()
                .setLogin("adamm")
                .setPassword("1234")
                .clickLoginButton()
                .assertIfUserIsLogin("Welcome Adam M");
    }

    @Test
    public void assertIfPasswordFieldsDidNotMatch() {
        loginPage.openLoginPage()
                .setLogin("adamm")
                .setPassword("123")
                .clickLoginButton()
                .assertPasswordNotMatch("The username and password could not be verified.");
    }
}
