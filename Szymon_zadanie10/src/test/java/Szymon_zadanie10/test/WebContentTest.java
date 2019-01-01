package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.HeaderComponentAssertion;
import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.test.common.SeleniumTest;
import Szymon_zadanie10.testData.CategoriesLists;
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


