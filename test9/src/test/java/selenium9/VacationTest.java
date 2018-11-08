package selenium9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VacationTest {
    public static final String ORIG = "Boston";
    public static final String DEST = "London";
    private static WebDriver driver;

    @BeforeClass
    public static void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Before
    public void testSetup() {
        driver.get("http://blazedemo.com");
    }

    @Test
    public void shouldDisplayVacationImage() {
        driver.findElement(By.cssSelector("a[href='vacation.html']")).click();
        assertTrue(driver.findElement(By.cssSelector("img[src$='vacation.jpg']")).isDisplayed());
    }

    @Test
    public void shouldShowResults() {
        Select from = new Select(driver.findElement(By.name("fromPort")));
        from.selectByValue(ORIG);
        Select to = new Select(driver.findElement(By.name("toPort")));
        to.selectByValue(DEST);
        driver.findElement(By.className("btn-primary")).click();
        assertEquals("Flights from " + ORIG + " to " + DEST + ":", driver.findElement(By.xpath("//h3")).getText());
    }

    @Test
    public void shouldlReturn6Rows() {
        Select from = new Select(driver.findElement(By.name("fromPort")));
        from.selectByValue(ORIG);
        Select to = new Select(driver.findElement(By.name("toPort")));
        to.selectByValue(DEST);
        driver.findElement(By.className("btn-primary")).click();
        assertEquals(6, driver.findElements(By.xpath("//tr")).size());
    }

    @Test
    public void shouldSubmitFlight() {
        Select from = new Select(driver.findElement(By.name("fromPort")));
        from.selectByValue(ORIG);
        Select to = new Select(driver.findElement(By.name("toPort")));
        to.selectByValue(DEST);
        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//tr[./td[.='Lufthansa']]//input")).click();
        assertEquals("Your flight from " + ORIG + " to " + DEST + " has been reserved.", driver.findElement(By.xpath("//h2")).getText());
    }

    @AfterClass
    public static void classTeardown() {
        driver.quit();
    }
}
