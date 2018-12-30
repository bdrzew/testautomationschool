package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.FirstPageAssertion;
import Szymon_zadanie10.model.User;
import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.scenario.RegisterUserScenario;
import Szymon_zadanie10.test.common.SeleniumTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTest extends SeleniumTest {

    private User user = new User();

    @BeforeClass
    public void testClassSetup(){
        user.generateUser();
        driver.navigate().to("http://automationpractice.com");
        new FirstPage(driver)
                .run(new RegisterUserScenario(user));
    }

    /*
     dodac 3 produkty ze strony startowej do koszyka i sprawdzic, ze odpowiednia ilosc produktow pojawia sie w koszyku (popup i header stony)
     */
    @Test
    public void addItemsToCartAndValidateQuantityTest (){
        driver.navigate().to("http://automationpractice.com");
        new FirstPage(driver)
                    .addToCart("Faded Short Sleeve T-shirts")
                    .continueShopping()
                    .addToCart("Blouse")
                    .continueShopping()
                    .addToCart("Printed Dress")
                .check(new FirstPageAssertion())
                    .verifyNumberOfItemsInPopup(3);



    }
}