package test.automation.school.stepdefinition;

import cucumber.api.java.en.Then;
import test.automation.school.assertion.flight.OrderSummaryAssertion;
import test.automation.school.page.flight.OrderSummaryPage;
import test.automation.school.stepdefinition.common.StepDefinition;

public class OrderSummaryStepDefinition extends StepDefinition {

    @Then("Text is displayed: {string}")
    public void textIsDisplayed(String expectedText) {
        new OrderSummaryPage(driverHandler.getDriver())
            .check(new OrderSummaryAssertion())
            .verifyTextIsPresent(expectedText);
    }
}
