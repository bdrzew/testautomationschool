package test.automation.school.stepdefinition.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import test.automation.school.stepdefinition.common.StepDefinition;

import java.io.File;
import java.io.IOException;

public class ReporterHookStepDefinition extends StepDefinition {

    @After
    public void testTearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            File scrnsht = ((TakesScreenshot) driverHandler.getDriver()).getScreenshotAs(OutputType.FILE);
            String location = System.getProperty("user.dir") + "//target//cucumber-html-reports//scr//"
                    + System.currentTimeMillis() + ".jpg";
            try {
                FileUtils.copyFile(scrnsht, new File(location));
            } catch (IOException e) {
                e.printStackTrace();
            }
            scenario.embed(("<a href=\"" + location + "\">" +
                    "<img src=\"" + location.replace("//", File.separator) +
                    "\" width=\"192\" height=\"108\" /></a>").getBytes(), "text/html");
        }
    }
}
