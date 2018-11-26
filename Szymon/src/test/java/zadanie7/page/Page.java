package zadanie7.page;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {
    protected WebDriver driver;

    public Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String username(int numberOfChars) {
        String randomString = RandomStringUtils.randomAlphanumeric(numberOfChars);
        return "user_" + randomString;
    }
}
