package test.automation.school.scenario;

import test.automation.school.page.ChooseFlightPage;
import test.automation.school.page.FlightOptionsPage;
import test.automation.school.scenario.common.Scenario;

public class PickFlightScenario implements Scenario<ChooseFlightPage, FlightOptionsPage> {
    private String from;
    private String to;

    public PickFlightScenario(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public FlightOptionsPage run(ChooseFlightPage chooseFlightPage) {
        return chooseFlightPage
                .selectDepartureCity(from)
                .selectDestinationCity(to)
                .clickFindFlights();
    }
}
