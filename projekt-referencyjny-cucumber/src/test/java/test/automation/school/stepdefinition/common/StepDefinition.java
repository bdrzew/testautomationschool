package test.automation.school.stepdefinition.common;

import com.google.inject.Inject;
import test.automation.school.config.WebDriverHandler;

public abstract class StepDefinition {
    @Inject
    protected WebDriverHandler driverHandler;
}
