package zadanie7.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends LeftNavigationMenu {

    public WelcomePage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

}
