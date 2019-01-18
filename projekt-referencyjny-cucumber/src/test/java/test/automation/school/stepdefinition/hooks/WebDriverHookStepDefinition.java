package test.automation.school.stepdefinition.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import test.automation.school.config.DriverType;
import test.automation.school.config.LocalWebDriverFactory;
import test.automation.school.config.RemoteWebDriverFactory;
import test.automation.school.config.WebDriverFactory;
import test.automation.school.stepdefinition.common.StepDefinition;

public class WebDriverHookStepDefinition extends StepDefinition {

    @Before(order = 0)
    public void testSetup() {
        driverHandler.setDriver(getWebDriverFactory().getDriver(
            DriverType.valueOf(System.getProperty("driver", "chrome").toUpperCase())));
    }

    @After(order = 0)
    public void testTearDown() {
        driverHandler.getDriver().quit();
    }

    private WebDriverFactory getWebDriverFactory() {
        boolean isRemote = Boolean.valueOf(System.getProperty("remote", "false"));
        return isRemote ? new RemoteWebDriverFactory() : new LocalWebDriverFactory();
    }
}
