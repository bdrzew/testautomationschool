package Szymon_zadanie10.page.product;

import Szymon_zadanie10.page.common.BaseStorePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductBlousePage extends BaseStorePage {
    @FindBy(xpath = ".//i[@class='icon-plus']")
    private WebElement increaseQuantityButton;
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    private WebElement addToCartButton;

    public ProductBlousePage(WebDriver driver) {
        super(driver);
    }

    public ProductBlousePage increaseQuantity(int howManyTimes) {
        for (int i = 1; i < howManyTimes; i++) {
            increaseQuantityButton.click();
        }
        return this;
    }

    public ProductBlousePage clickAddToCartButton() {
        addToCartButton.click();
        return this;
    }
}
