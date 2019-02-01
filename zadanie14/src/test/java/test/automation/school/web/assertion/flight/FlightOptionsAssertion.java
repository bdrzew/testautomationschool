package test.automation.school.web.assertion.flight;

import org.openqa.selenium.WebElement;
import test.automation.school.web.assertion.common.Assertion;
import test.automation.school.web.page.login.LoginPage;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class FlightOptionsAssertion extends Assertion<LoginPage> {

    public FlightOptionsAssertion verifyFlightNumberOrder(List<String> expectedFlights) {
//        List<String> actualFlights = page.getFlights().stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
//        assertEquals("Flights are not in expected order", expectedFlights, actualFlights);
        return this;
    }

}
