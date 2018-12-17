package zadanie10.page;

import org.openqa.selenium.WebDriver;
import zadanie10.page.common.Page;

public class LoginPage extends Page {



    public LoginPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }
}
