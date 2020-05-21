package Szymon_zadanie10.assertion;

import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.common.BaseStorePage;

import static org.testng.AssertJUnit.assertEquals;

public class BaseStorePageAssertion extends Assertion<BaseStorePage> {

    public BaseStorePageAssertion verifyNumberOfItemsInPopup(Integer i) {
        page.waitUntil(p -> page.getTextNumberOfItemsInCartFromPopup().getText().equals(i.toString()));
        assertEquals(i.toString(), page.getTextNumberOfItemsInCartFromPopup().getText());
        return this;
    }
}