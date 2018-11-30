package test.automation.school.test;


import org.testng.annotations.Test;
import test.automation.school.assertion.FlightOptionsAssertion;
import test.automation.school.page.ChooseFlightPage;
import test.automation.school.scenario.PickFlightScenario;
import test.automation.school.test.common.SeleniumTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * blazedemo.com tests
 */
public class BlazedemoScenarioTest extends SeleniumTest
{

    /**
     * Verifies if flight numbers of 'Virgin America' airlines are displayed in right order
     * And if all flight are there, no matter in what order
     */
    @Test
    public void airlinesTest() {
        new ChooseFlightPage(driver, "http://www.blazedemo.com")
            .run(new PickFlightScenario("Boston", "Berlin"))
            .clickFlightButton(1);
          //.assertSomething();

    }
}
