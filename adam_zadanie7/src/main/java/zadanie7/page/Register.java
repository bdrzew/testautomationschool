package zadanie7.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class Register extends LoginPage {
    protected WebDriver driver;

    @FindBy(xpath = "//p[@class='smallText']")
    private WebElement labelWelcome;

    public Register(WebDriver driver, String url) {
        super(driver, url);
    }
    public Register assertIfUserIsLogin(String text) {
        assertTrue(labelWelcome.getText().contains(text), "Welcome Adam M");
        return this;
    }
}
