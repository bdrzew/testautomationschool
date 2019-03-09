package zadanie10.scenario.common;

import zadanie10.page.common.Page;

public interface Scenario<Input extends Page, Output extends Page> {
    Output run (Input entry);
}
