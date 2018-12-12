package Szymon7.test;

import Szymon7.User;
import Szymon7.assertion.TransferCompleteAssertion;
import Szymon7.page.accountServicesPage.AccountServicesPage;
import Szymon7.page.WelcomePage;
import Szymon7.scenario.FullRegisterUserScenario;
import Szymon7.scenario.LoginScenario;
import Szymon7.test.common.SeleniumTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TransferFundsTest extends SeleniumTest {
    private User user = new User();

    @BeforeMethod

    public void eachTestSetup() {
        user.setUsername();
        new WelcomePage(driver, "http://parabank.parasoft.com", user)
            .run(new FullRegisterUserScenario(), user)
            .run(new LoginScenario(user), user);
    }

    @Test
    public void transferFundsTest (){
        Integer amount = 666;
        new AccountServicesPage(driver)
            .clickTransferFundsLink()
            .enterAmountToTransfer(amount)
            .clickTransferButtonAndRedirect()
        .check(new TransferCompleteAssertion())
            .assertThatConfirmationTextIsPresent();
        ;
    }

    @Test
    public void transferFundsNoAmountTest(){
        //TODO
    }
}
