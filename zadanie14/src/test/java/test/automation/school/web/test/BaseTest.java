package test.automation.school.web.test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.automation.school.rest.model.Data;
import test.automation.school.rest.model.Lead;
import test.automation.school.rest.scenario.CreateLeadScenario;
import test.automation.school.web.page.login.LoginPage;
import test.automation.school.web.scenario.LoginScenario;
import test.automation.school.web.test.common.SeleniumTest;

import java.util.ResourceBundle;

public class BaseTest extends SeleniumTest
{
    Lead lead = new Lead ()
            .withData(new Data()
                    .withFirstName("Jan")
                    .withLastName("Nowak")
                    .withOrganizationName("Google"));

    @BeforeClass(alwaysRun = true)
    public void baseSetup() {
        new CreateLeadScenario().createLead(lead);
    }


    @Test()
    public void checkLeadTest() {
        new LoginPage(driver, ResourceBundle.getBundle("config").getString("url"))
                .run(new LoginScenario(ResourceBundle.getBundle("config").getString("username"),
                        ResourceBundle.getBundle("config").getString("password")))
                    .getHeaderComponent()
                    .clickLeads()
                    .clickLeadWithText(lead)
                .check(new LeadsPageAssetion())
                    .verifyLeadStatus("New");
    }
}
