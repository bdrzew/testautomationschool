package zajecia6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import zajecia6.page.AllFormPage;

import static org.testng.Assert.assertEquals;

/**
 * This class is designed to test 2 forms available at
 * https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
 */
public class FormTest {

    private WebDriver driver;
    private AllFormPage allFormPage;

    @BeforeClass
    public void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        allFormPage = new AllFormPage(driver);
    }

    @BeforeMethod
    public void testSetup() {
        allFormPage.openPage("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    @AfterClass
    public void teardownClass() {
        driver.quit();
    }

    @Test
    public void fillFirstFormTest() {
        allFormPage.fillFirstFormMessageField("Some message");
        allFormPage.clickShowMessageButton();
        assertEquals(allFormPage.getMessageDisplayed(), "Some message");
    }

    @Test
    public void fillSecondFormTest() {
        int firstNumber = 2;
        int secondNumber = 5;
        int sum = firstNumber+secondNumber;
        allFormPage.enterValueA(firstNumber);
        allFormPage.enterValueB(secondNumber);
        allFormPage.clickGetTotalButton();

        assertEquals(allFormPage.getTotalValue(), sum);
    }


    @Test
    public void fillTwoInputFieldsTest() {
        allFormPage.fillAField("dupa");
        allFormPage.fillBField("123");
        allFormPage.clickGetTotalButton();
        assertEquals(allFormPage.getTotalDisplayed(), "NaN");
    }
}
