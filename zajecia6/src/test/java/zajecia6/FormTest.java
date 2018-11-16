package zajecia6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import zajecia6.page.FirstFormPage;

/**
 * This class is designed to test 2 forms available at
 * https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
 */
public class FormTest {

    private WebDriver driver;
    private FirstFormPage firstFormPage;

    @BeforeClass
    public void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        firstFormPage = new FirstFormPage(driver);
    }

    @BeforeMethod
    public void testSetup() {
        firstFormPage.openPage("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    @AfterClass
    public void teardownClass() {
        driver.quit();
    }

    @Test
    public void fillFormTest() {
        firstFormPage.fillMessageField("Some message");
        firstFormPage.clickShowMessageButton();
        Assert.assertEquals(firstFormPage.getMessageDisplayed(), "Some message");
    }
}
