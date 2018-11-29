package zadanie7.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import zadanie7.page.LoginPage;
import zadanie7.page.Register;

public class LoginTest extends BeforeAfterTest {
    @BeforeMethod
    public void Start() {
        new LoginPage(driver, "http://parabank.parasoft.com/")
                .setLogin("adamm")
                .setPassword("1234")
                .clickLoginButton();
    }

    @Test
    public void checkIfUserIsLogin() {
        new Register(driver, "http://parabank.parasoft.com/parabank/overview.htm")
                .assertIfUserIsLogin("Welcome Adam M");
    }
}
