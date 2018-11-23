package org.testautomation;

import org.testautomation.page.ChooseFlightPage;
import org.testautomation.page.FlightOptionsPage;
import org.testng.annotations.Test;

public class FindFlightTest extends SeleniumTest {

    @Test
    public void verifyFlightsAreVisible() {
        new ChooseFlightPage(driver, "http://www.blazedemo.com")
                .selectDepartureCity("San Diego")
                .selectDestinationCity("Dublin")
                .clickFindFlights();

        new FlightOptionsPage(driver)
                .checkNumberOfVisibleFlights(5);

    }
}
