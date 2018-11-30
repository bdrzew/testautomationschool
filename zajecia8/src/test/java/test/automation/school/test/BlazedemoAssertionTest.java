package test.automation.school.test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.automation.school.assertion.FlightOptionsAssertion;
import test.automation.school.assertion.OrderSummaryAssertion;
import test.automation.school.page.ChooseFlightPage;
import test.automation.school.page.FlightOptionsPage;
import test.automation.school.scenario.PickFlightScenario;
import test.automation.school.scenario.PurchaseScenrio;
import test.automation.school.test.common.SeleniumTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * blazedemo.com tests
 */
public class BlazedemoAssertionTest extends SeleniumTest
{
    private List<String> flightNumbersOrderVA = Arrays.asList("43", "234", "9696", "12", "4346");
    private Set<String> flightNumbersUnordered = new HashSet<>(Arrays.asList("12", "43", "9696", "4346", "234"));

    /**
     * Verifies if flight numbers of 'Virgin America' airlines are displayed in right order
     * And if all flight are there, no matter in what order
     */
    @Test
    public void airlinesTest() {
        new ChooseFlightPage(driver, "http://www.blazedemo.com")
                .run(new PickFlightScenario("Paris", "Buenos Aires"))
            .check(FlightOptionsAssertion.class)
                .verifyFlightNumberOrder(flightNumbersOrderVA)
                .verifyFlightNumbersUnordered(flightNumbersUnordered);
    }

    @Test
    public void bookFlight() {
        new ChooseFlightPage(driver, "http://www.blazedemo.com")
                .run(new PickFlightScenario("Paris", "Buenos Aires"))
                .clickFlightButton(0)
                .run(new PurchaseScenrio("Adam"))
                .check(OrderSummaryAssertion.class)
                    .verifyTextIsPresent("Thank you");
    }
}
