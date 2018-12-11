package Szymon7.page;

import org.openqa.selenium.WebDriver;

public class WelcomePage extends CustomerLoginPage {

    public WelcomePage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

}
