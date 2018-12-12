package Szymon7.page;

import Szymon7.User;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends CustomerLoginPage {

    public WelcomePage(WebDriver driver, String url, User user) {
        super(driver);
        driver.get(url);
    }
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

}
