package Szymon7.scenario.common;

import Szymon7.page.common.Page;

/**
 * Interface representing scenarios which should act as
 * shortcuts in test setup, but not to replace test logic
 */
public interface Scenario<Input extends Page, Output extends Page> {
    Output run(Input entry);
}