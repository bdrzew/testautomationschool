package test.automation.school.config;

import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

@ScenarioScoped
public class WebDriverHandler {
    private WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
