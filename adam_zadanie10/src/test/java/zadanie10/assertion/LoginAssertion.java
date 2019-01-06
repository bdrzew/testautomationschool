package zadanie10.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import zadanie10.assertion.common.Assertion;
import zadanie10.page.LoginPage;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;


public class LoginAssertion extends Assertion<LoginPage> {

    public LoginAssertion IsLoginPageIsLoaded() {
        page.waitUntil(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        return this;
    }
}

