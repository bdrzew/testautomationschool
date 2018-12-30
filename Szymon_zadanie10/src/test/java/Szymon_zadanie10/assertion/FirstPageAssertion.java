package Szymon_zadanie10.assertion;


import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.FirstPage;

import static org.testng.AssertJUnit.assertEquals;

public class FirstPageAssertion extends Assertion<FirstPage> {
    public FirstPageAssertion verifyNumberOfItemsInPopup(int i) {
        assertEquals(page.getTextNumberOfItemsInCartFromPopup().getText(), "There are "+i+" items in your cart.");

        return this;
    }
}
