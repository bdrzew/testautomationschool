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

    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li")
    private WebElement categories;

    public ContextMenuComponent(WebDriver driver) {
        super(driver);
    }

}
