package test.automation.school.stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import test.automation.school.assertion.flight.FlightOptionsAssertion;
import test.automation.school.page.flight.FlightOptionsPage;
import test.automation.school.stepdefinition.common.StepDefinition;

import java.util.List;

public class FlightOptionsStepDefinition extends StepDefinition {

    @Then("Displayed flights order is as follows:")
    public void verifyFlightOrder(List<String> flights) {
        new FlightOptionsPage(driverHandler.getDriver())
            .check(new FlightOptionsAssertion())
            .verifyFlightNumberOrder(flights);
    }

    @When("Flight {int} is selected")
    public void flightNumberIsSelected(int flightIndex) {
        new FlightOptionsPage(driverHandler.getDriver())
                .clickFlightButton(flightIndex);
    }
}
