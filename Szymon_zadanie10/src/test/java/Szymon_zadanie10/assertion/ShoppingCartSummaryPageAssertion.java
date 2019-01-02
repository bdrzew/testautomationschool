package Szymon_zadanie10.assertion;

import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.checkout.ShoppingCartSummaryPage;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class ShoppingCartSummaryPageAssertion extends Assertion<ShoppingCartSummaryPage> {

    public ShoppingCartSummaryPageAssertion verifyProducts(List<String> expectedProductsOnlyForThisTest) {
        List<String> actualProducts = page.getProductList().stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        assertEquals(actualProducts, expectedProductsOnlyForThisTest);
        return this;
    }

    public ShoppingCartSummaryPageAssertion verifyTotalPrice(List<Double> pricesOnlyForThisTest, Double shippingPrice) {
        Double sum = pricesOnlyForThisTest.stream().mapToDouble(d->d).sum();
        double expectedTotalPrice = sum + shippingPrice;

        String actualTotalPrice = page.getActualTotalPrice().getText();

        assertEquals(actualTotalPrice, "$"+Double.toString(expectedTotalPrice));
        return this;
    }
}
