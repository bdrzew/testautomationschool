package test.automation.school.web.assertion;

import test.automation.school.web.assertion.common.Assertion;
import test.automation.school.web.page.LeadDetailsPage;

import static org.testng.AssertJUnit.assertEquals;

public class LeadDetailsPageAssertion extends Assertion<LeadDetailsPage> {

    public LeadDetailsPageAssertion verifyLeadStatus(String status) {
        assertEquals(page.getLeadStatus().getText(), status);
        return this;
    }
}
