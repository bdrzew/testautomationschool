package Szymon_zadanie10.page;

import Szymon_zadanie10.page.common.AbstractStorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends AbstractStorePage {
    @FindBy (xpath = "//span[@title='Continue shopping']//span")
    private WebElement continueShoppingbutton;
    @FindBy (xpath = "//div[contains(@class,'layer_cart_cart col-xs-12 col-md-6')]//span[contains(@class,'unvisible')]")
    private WebElement textNumberOfItemsInCartFromPopup;

    public FirstPage(WebDriver driver) {
        super(driver);
    }

    public FirstPage addToCart(String itemTitle) {
//        driver.findElement(By.xpath("//div[@itemscope][.//a[@title='"+itemTitle+"']]")).

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//div[@itemscope][.//a[@title='"+itemTitle+"']]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[@itemscope][.//a[@title='"+itemTitle+"']]//a/span[contains(text(),'Add to cart')]"))).click().build().perform();

        return this;
    }

    public FirstPage continueShopping() {
        waitUntil(p-> continueShoppingbutton.isDisplayed());
        continueShoppingbutton.click();
        return this;
    }

    public WebElement getTextNumberOfItemsInCartFromPopup() {
        return textNumberOfItemsInCartFromPopup;
    }
}
