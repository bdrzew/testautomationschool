package Szymon_zadanie10.assertion;

import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.component.ContextMenuComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContextMenuComponentAssertion extends Assertion <ContextMenuComponent> {

    public ContextMenuComponentAssertion verifyCategoriesInHeaderByTitle(String women, String dresses, String s) {

//        assertEquals((page.getCategories()).getAttribute("title").toString().equals(women+dresses+tShirt));
////        expected.length != allOptions.size()
//        assertTrue(page.getCategories().toString().contains(women));
////        assertEquals((page.getCategories()).getAttribute("title").toString().equals(women+dresses+tShirt));

        return this;
    }
}
