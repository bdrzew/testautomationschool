package test.automation.school.web.test;


import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.automation.school.web.test.common.SeleniumTest;


/**
 * blazedemo.com tests
 */
public class BlazedemoAssertionTest extends SeleniumTest
{

    @BeforeClass(alwaysRun = true)
    public void blazedemoAssertionClassSetup(ITestContext context, String url) {
    }

    /**
     * Verifies if flight numbers are displayed in right order
     * And if all flight are there, no matter in what order
     */
    @Test(groups = {"SMOKE"})
    public void airlinesTest() {

    }

}
