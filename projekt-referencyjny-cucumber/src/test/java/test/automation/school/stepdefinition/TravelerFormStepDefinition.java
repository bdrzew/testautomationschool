package test.automation.school.stepdefinition;

import cucumber.api.java.en.When;
import test.automation.school.page.flight.TrawellerFormPage;
import test.automation.school.stepdefinition.common.StepDefinition;

public class TravelerFormStepDefinition extends StepDefinition {

    @When("Purchase form is submitted using name {string}")
    public void purchaseFormIsSubmittedUsingName(String name) {
        new TrawellerFormPage(driverHandler.getDriver())
                .setUserName(name)
                .clickPurchaseFlight();
    }

}
