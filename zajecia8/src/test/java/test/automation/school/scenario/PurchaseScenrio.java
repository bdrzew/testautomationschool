package test.automation.school.scenario;

import test.automation.school.page.OrderSummaryPage;
import test.automation.school.page.TrawellerFormPage;
import test.automation.school.scenario.common.Scenario;

public class PurchaseScenrio implements Scenario<TrawellerFormPage, OrderSummaryPage> {
    private String name;

    public PurchaseScenrio(String name) {
        this.name = name;
    }

    @Override
    public OrderSummaryPage run(TrawellerFormPage entry) {
        return entry
                .setUserName(name)
                .clickPurchaseFlight();
    }
}
