package Szymon_zadanie10.page.component;

import Szymon_zadanie10.page.common.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
możliwe że klasa nie potrzebna bo przeniosłem funkcjonalność do BaseStorePage
 */
public class ProductOptionsComponent extends Component {
    public ProductOptionsComponent(WebDriver driver) {
        super(driver);
    }
}