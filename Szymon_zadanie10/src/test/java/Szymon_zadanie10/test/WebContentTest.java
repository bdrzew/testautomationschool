package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.ContextMenuComponentAssertion;
import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.page.component.ContextMenuComponent;
import Szymon_zadanie10.test.common.SeleniumTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
    public void categoriesInHeaderCheckTest (){

        new ContextMenuComponent(driver)
                .check(new ContextMenuComponentAssertion())
                    .verifyCategoriesInHeaderByTitle("Women", "Dresses", "T-shirts");
        // nie wiem, próbowałem enuma, hashSet, liste. Nie wiem jak z tego korzystać. Za mało wiedzy o tych typach.
        // Nie wiem jak przejść przez listę WebElementów, wyciągnąć z każdego atrybut, i po tym atrybucie wrzucić do asercji.
    }

}
