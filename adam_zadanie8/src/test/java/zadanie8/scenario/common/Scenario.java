package zadanie8.scenario.common;

import zadanie8.page.common.Page;

public interface Scenario<Input extends Page, Output extends Page> {
    Output run(Input entry);
}
