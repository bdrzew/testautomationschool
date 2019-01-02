package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.FirstPageAssertion;
import Szymon_zadanie10.model.User;
import Szymon_zadanie10.page.FirstPage;
import Szymon_zadanie10.scenario.RegisterUserScenario;
import Szymon_zadanie10.test.common.SeleniumTest;
import Szymon_zadanie10.testData.CategoriesLists;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ShoppingTest extends SeleniumTest {

    private User user = new User();

    @BeforeClass
    public void testClassSetup(){

        //do debugu jest defaultowy user
//        user.generateUser();
//        driver.navigate().to("http://automationpractice.com");
//        new FirstPage(driver)
//                .run(new RegisterUserScenario(user));
    }


    /*
    dodac 3 produkty ze strony startowej do koszyka i sprawdzic, ze odpowiednia ilosc produktow pojawia sie w koszyku (popup i header stony)
     */
    @Test
    public void addItemsToCartAndValidateQuantityTest (){
        driver.navigate().to("http://automationpractice.com");
        new FirstPage(driver)
                .getProductOptionsComponent()
                    .addToCart("Faded Short Sleeve T-shirts")
                    .continueShopping()
                    .addToCart("Blouse")
                    .continueShopping()
                    .addToCart("Printed Dress")
                .check(new FirstPageAssertion())
                    .verifyNumberOfItemsInPopup(3);
    }

    /*
     dodac 3 produkty z 3 roznych kategorii, wejsc do koszyka (klikajac koszyk w headerze) i sprawdzic czy sa wszystkie produkty i czy poprawnie sie zsumowala cena
     */
    @Test
    public void addItemsToCartAndValidateCartItemsAndPriceTest() {
        driver.navigate().to("http://automationpractice.com");
        new FirstPage(driver)
                .getHeaderComponent()
                .clickCategory(CategoriesLists.getMainCategories().get(0))
                .getWomanCategoryPage()
                .getProductOptionsComponent()
                .addToCart("Faded Short Sleeve T-shirts")
                .continueShopping()
                .getWomanCategoryPage()

    }
}