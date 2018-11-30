package test.automation.school.page.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import test.automation.school.assertion.common.Assertion;
import test.automation.school.scenario.common.Scenario;

public abstract class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <G extends Page, T extends Assertion<G>> T check(Class<T> clazz) throws RuntimeException {
        try {
            Assertion<G> assertion = clazz.newInstance();
            assertion.setPage((G)this);
            return (T) assertion;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Error occur during creating Assertions.", e);
        }
    }

    public <Input extends Page, Output extends Page> Output run(Scenario<Input, Output> scenario) {
        return scenario.run((Input) this);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
