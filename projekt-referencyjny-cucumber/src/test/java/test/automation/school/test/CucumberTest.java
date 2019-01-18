package test.automation.school.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin ={"json:target/cucumber.json",
                 "pretty"},
        glue = {"test/automation/school/stepdefinition"},
        features = {"classpath:features"}
)
public class CucumberTest extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
