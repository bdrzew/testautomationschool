package selenium9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    }

    @Before
    public void testSetup() {
    }

    @AfterClass
    public static void classTeardown() {
    }
}
