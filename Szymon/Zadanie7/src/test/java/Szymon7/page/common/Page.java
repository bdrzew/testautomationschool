package Szymon7.page.common;

import Szymon7.User;
import Szymon7.assertion.common.Assertion;
import Szymon7.scenario.common.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {
    protected WebDriver driver;

    public Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <G extends Page, T extends Assertion<G>> T check(T assertion)  {
            assertion.setPage((G)this);
            return assertion;
    }

    public <Input extends Page, Output extends Page> Output run(Scenario<Input, Output> scenario, User user) {
        return scenario.run((Input) this, user);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
