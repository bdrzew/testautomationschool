package selenium9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This class is designed to test all 3 kind of alerts available on
 * https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
 */
public class AlertTest {
    private static WebDriver driver;

    @BeforeClass
    public static void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Before
    public void testSetup() {
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
    }

    @AfterClass
    public static void classTeardown() {
        driver.quit();
    }

    @Test
    public void clickPromptBoxText(){
        WebElement el =  driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]"));
        el.click();
        assertEquals("Enter name",driver.switchTo().alert().getText() );

        driver.switchTo().alert().accept();

            try {
                Thread.sleep(5555);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

}
