package Szymon_zadanie10.page.component;

import Szymon_zadanie10.page.common.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductOptionsComponent extends Component {
    public ProductOptionsComponent(WebDriver driver) {
        super(driver);
    }

    public AddToCartPopUpComponent addToCart(String itemTitle) {
        String xpathForItemAddButton = "//div[@itemscope][.//a[@title='" + itemTitle + "']]//a/span[contains(text(),'Add to cart')]";
        String xpathForItem = "//div[@itemscope][.//a[@title='" + itemTitle + "']]";

        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(xpathForItem)));

        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath(xpathForItem));
        action.moveToElement(we).moveToElement(driver.findElement(
                By.xpath(xpathForItemAddButton)))
                .click().build().perform();
        return new AddToCartPopUpComponent(driver);
    }
}