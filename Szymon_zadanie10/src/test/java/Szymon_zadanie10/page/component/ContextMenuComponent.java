package Szymon_zadanie10.page.component;

import Szymon_zadanie10.page.common.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.IAttributes;

import java.util.List;
import java.util.stream.Collectors;

public class ContextMenuComponent extends Component {

    @FindBy (xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li")
    private WebElement categories;

    public ContextMenuComponent(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getCategories() {
        //var1
        List<WebElement> allCategories = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));

        return allCategories;

        //var2
        //return driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));
        //var3
        //        return categories;
    }
}
