package Szymon_zadanie10.page.checkout;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class ShoppingCartSummaryPage extends BaseStorePage {
    @FindBy (xpath = "//td[@class='cart_description']/p")
    private List<WebElement> dressesCategoriesList;
    @FindBy (id = "total_price")
    private WebElement actualTotalPrice;

    public ShoppingCartSummaryPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getProductList() {
        waitUntil(p -> !dressesCategoriesList.isEmpty());
        return dressesCategoriesList;
    }


    public WebElement getActualTotalPrice() {
        return actualTotalPrice;
    }
}
