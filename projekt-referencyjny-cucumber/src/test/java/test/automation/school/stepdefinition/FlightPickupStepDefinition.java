package test.automation.school.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import test.automation.school.page.flight.ChooseFlightPage;
import test.automation.school.stepdefinition.common.StepDefinition;

public class FlightPickupStepDefinition extends StepDefinition {

    @Given("Blazedemo choose flight page opened")
    public void chooSeFlightPageOpened() {
        new ChooseFlightPage(driverHandler.getDriver(), "http://www.blazedemo.com");
    }

    @When("Flight picked up from {string} to {string}")
    public void pickFlight(String from, String to) {
        new ChooseFlightPage(driverHandler.getDriver())
            .selectDepartureCity(from)
            .selectDestinationCity(to)
            .clickFindFlights();
    }
}
