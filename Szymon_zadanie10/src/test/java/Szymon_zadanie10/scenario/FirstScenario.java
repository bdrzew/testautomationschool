package Szymon_zadanie10.scenario;

import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.scenario.common.Scenario;

public class FirstScenario implements Scenario<FirstPage, FirstPage> {
    private String from;
    private String to;

    public FirstScenario(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public FirstPage run(FirstPage firstPage) {
        return firstPage
                // .things
        ;
    }
}