package zadanie10.page.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import zadanie10.assertion.common.Assertion;
import zadanie10.scenario.common.Scenario;

public abstract class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <G extends Page, T extends Assertion<G>> T check(T assertion) {
        assertion.setPage((G)this);
        return assertion;
    }

    public <Input extends Page, Output extends Page> Output run(Scenario<Input, Output> scenario) {
        return scenario.run((Input) this);
    }

    public WebDriver getDriver() {
        return driver;
    }


}
