package Szymon_zadanie10.assertion;


import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.page.component.AddToCartPopUpComponent;

import static org.testng.AssertJUnit.assertEquals;

public class FirstPageAssertion extends Assertion<AddToCartPopUpComponent> {
    public FirstPageAssertion verifyNumberOfItemsInPopup(Integer i) {
        page.waitUntil(p -> page.getTextNumberOfItemsInCartFromPopup().getText().equals(i.toString()));
        assertEquals(i.toString(), page.getTextNumberOfItemsInCartFromPopup().getText());
        return this;
    }
}
