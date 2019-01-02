package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.HeaderComponentAssertion;
import Szymon_zadanie10.page.firstPage.FirstPage;
import Szymon_zadanie10.test.common.SeleniumTest;
import Szymon_zadanie10.testData.CategoriesLists;
import org.testng.annotations.Test;

public class WebContentTest extends SeleniumTest {



    /*
      3. sprawdzic czy w menu kontekstowych (header) pojawiaja sie poprawne kategorie (przyjac, ze ma byc tak jak sie wyswietla)
     */
    @Test
    public void mainCategoriesInHeaderCheckTest() {
        new FirstPage(driver)
                .getHeaderComponent()
                .check(new HeaderComponentAssertion())
                .verifyMainCategories(CategoriesLists.getMainCategories());
    }

    @Test
    public void dressesCategoriesInHeaderCheckTest() {
        new FirstPage(driver)
                    .getHeaderComponent()
                    .hoverOverDressesCategories()
                .check(new HeaderComponentAssertion())
                    .verifyDressesCategories(CategoriesLists.getDressesCategories());
    }

}


