package org.testautomation.test;

import org.testautomation.page.ChooseFlightPage;
import org.testng.annotations.Test;

public class FindFlightTest extends SeleniumTest {

    @Test
    public void verifyFlightsAreVisible() {
        new ChooseFlightPage(driver, "http://www.blazedemo.com")
                .selectDepartureCity("San Diego")
                .selectDestinationCity("Dublin")
                .clickFindFlights()
                .checkNumberOfVisibleFlights(5);
    }
}
