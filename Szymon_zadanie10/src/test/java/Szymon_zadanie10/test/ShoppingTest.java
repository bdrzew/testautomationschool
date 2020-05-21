package Szymon_zadanie10.test;

import Szymon_zadanie10.assertion.BaseStorePageAssertion;
import Szymon_zadanie10.assertion.OrderConfirmationCheckoutStepPageAssertion;
import Szymon_zadanie10.assertion.ShoppingCartSummaryPageAssertion;
import Szymon_zadanie10.model.User;
import Szymon_zadanie10.page.firstPage.FirstPage;
import Szymon_zadanie10.scenario.SignInUserScenario;
import Szymon_zadanie10.test.common.SeleniumTest;
import Szymon_zadanie10.testData.CategoriesLists;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ShoppingTest extends SeleniumTest {

    private User user = new User();

    @BeforeMethod(alwaysRun = true)
    public void testClassSetup(){
        driver.navigate().to("http://automationpractice.com");
    }

    @AfterMethod(alwaysRun = true)
    public void testTeardown(){
        driver.manage().deleteAllCookies();
    }

    /*
    4. dodac 3 produkty ze strony startowej do koszyka i sprawdzic, ze odpowiednia ilosc produktow pojawia sie w koszyku (popup i header stony)
     */
    @Test
    public void addItemsToCartAndValidateQuantityTest (){
        new FirstPage(driver)
                    .addToCart("Faded Short Sleeve T-shirts")
                    .continueShopping()
                    .addToCart("Blouse")
                    .continueShopping()
                    .addToCart("Printed Dress")
                .check(new BaseStorePageAssertion())
                    .verifyNumberOfItemsInPopup(3);
    }

    /*
     5. dodac 3 produkty z 3 roznych kategorii, wejsc do koszyka (klikajac koszyk w headerze) i sprawdzic czy sa wszystkie produkty i czy poprawnie sie zsumowala cena
     */
    @Test
    public void addItemsToCartAndValidateCartItemsAndTotalPriceTest() {
        List<String> productsOnlyForThisTest = Arrays.asList("Printed Chiffon Dress", "Printed Summer Dress", "Faded Short Sleeve T-shirts");
        List<Double> pricesOnlyForThisTest = Arrays.asList(16.40, 28.98, 16.51);
        Double shippingPrice = 2.0;

        new FirstPage(driver)
                .getHeaderComponent()
                    .clickCategory(CategoriesLists.getMainCategories().get(0))
                .getWomanCategoryPage()
                    .addToCart(productsOnlyForThisTest.get(0))
                    .continueShopping()
                .getHeaderComponent()
                    .clickCategory(CategoriesLists.getMainCategories().get(1))
                .getDressesCategoryPage()
                    .addToCart(productsOnlyForThisTest.get(1))
                    .continueShopping()
                .getHeaderComponent()
                    .clickCategory(CategoriesLists.getMainCategories().get(2))
                .getTShirtCategoryPage()
                    .addToCart(productsOnlyForThisTest.get(2))
                    .continueShopping()
                .getHeaderComponent()
                    .clickCartField()
                .check(new ShoppingCartSummaryPageAssertion())
                    .verifyProducts(productsOnlyForThisTest)
                    .verifyTotalPrice(pricesOnlyForThisTest, shippingPrice);
    }

    /*
     6. wejsc w szczegoly produktu, kliknac '+' 5 razy i dodac do koszyka - sprawdzic w popupie poprawnosc danych
     */
    @Test
    public void addItemsAndMultiplyAndValidate () {
        new FirstPage(driver)
                    .clickProductMoreButton("Blouse")
                .getProductBlousePage()
                    .increaseQuantity(5)
                    .clickAddToCartButton()
                .check(new BaseStorePageAssertion())
                    .verifyNumberOfItemsInPopup(5);
    }

    /*
     7. dokonac pelnego zakupu 1 produktu - sprawdzic, czy wyswietla sie podsumowanie zakupow z poprawnymi danymi
     */
    @Test
    public void fullPurchaseProcess () {
        new FirstPage(driver)
                .run(new SignInUserScenario(user))
                        .addToCart("Faded Short Sleeve T-shirts")
                    .clickProceedToCheckoutOnPopup()
                    .clickProceedToCheckoutOnSummary()
                    .clickProceedToCheckoutOnAddress()
                        .agreeToTermsOfService()
                    .clickProceedToCheckoutOnShipping()
                    .clickPayByBankWire()
                    .clickIConfirmMyOrder()
                .check(new OrderConfirmationCheckoutStepPageAssertion())
                    .verifyAmount("$18.51")
                    .verifyAccountOwner("Pradeep Macharla"); //zahardcodowane na stronie
    }
}