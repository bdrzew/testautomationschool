package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.HeaderComponentAssertion;
import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.test.common.SeleniumTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class WebContentTest extends SeleniumTest {

    @BeforeClass
    public void testClassSetup() {
        driver.navigate().to("http://automationpractice.com");
        new FirstPage(driver);
    }

    /*
     sprawdzic czy w menu kontekstowych (header) pojawiaja sie poprawne kategorie (przyjac, ze ma byc tak jak sie wyswietla)
     */
    @Test
    public void mainCategoriesInHeaderCheckTest() {
        List<String> mainCategories = Arrays.asList("WOMEN", "DRESSES", "T-SHIRTS");

        new FirstPage(driver)
                .getHeaderComponent()
                .check(new HeaderComponentAssertion())
                .verifyMainCategories(mainCategories);
    }

    @Test
    public void dressesCategoriesInHeaderCheckTest() {
        List<String> dressesCategory = Arrays.asList("xxx", "yy");

        new FirstPage(driver)
                    .getHeaderComponent()
                    .hoverOverDressesCategories()
                .check(new HeaderComponentAssertion())
                    .verifyDressesCategories(dressesCategory);

    }

}


