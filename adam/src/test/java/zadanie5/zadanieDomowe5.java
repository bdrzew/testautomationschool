package zadanie5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class zadanieDomowe5 {

    static WebDriver driver;

    @BeforeClass
    public static void classSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Before

    public void testSetup() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
    @Test
    public void shouldReturnsMenuOptions(){

        driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
        assertEquals(4, driver.findElements(By.xpath("//a[@class='bm-item menu-item']")).size());
    }
    @Test
    public void shouldBuyBackpack(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='inventory_item'][.//div[text()='Sauce Labs Backpack']]//button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        assertTrue(driver.findElement(By.xpath("//div[@class='inventory_item'][.//div[text()='Sauce Labs Backpack']]//button[@class='remove-from-cart-button']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).isDisplayed());

        WebElement shoppingCart = driver.findElement(By.id(("shopping_cart_container")));
        assertTrue(driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).isDisplayed());
        shoppingCart.click();
        assertTrue(driver.findElement(By.xpath("//div[@class='inventory_item_name']")).isDisplayed());
        driver.findElement(By.xpath("//a[@class='cart_checkout_link']")).click();
        driver.findElement(By.xpath("//input[@data-test='firstName']")).sendKeys("Adam");
        driver.findElement(By.xpath("//input[@data-test='lastName']")).sendKeys("Moskal");
        driver.findElement(By.xpath("//input[@data-test='postalCode']")).sendKeys("11-234");

        driver.findElement(By.xpath("//input[@class='cart_checkout_link']")).click();
        assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed());
        driver.findElement(By.xpath("//a[@class='cart_checkout_link']")).click();
        assertEquals("THANK YOU FOR YOUR ORDER", driver.findElement(By.xpath("//h2[@class='complete-header']")).getText());
    }
    @Test
    public void shouldDeleteFromBasket() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='inventory_item'][.//div[text()='Sauce Labs Backpack']]//button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        assertTrue(driver.findElement(By.xpath("//div[@class='inventory_item'][.//div[text()='Sauce Labs Backpack']]//button[@class='remove-from-cart-button']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).isDisplayed());

        WebElement shoppingCart = driver.findElement(By.id(("shopping_cart_container")));
        assertTrue(driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).isDisplayed());
        shoppingCart.click();
        assertTrue(driver.findElement(By.xpath("//div[@class='inventory_item_name']")).isDisplayed());
        driver.findElement(By.xpath("//button[@class='remove-from-cart-button']")).click();
        //assertFalse("Sauce Labs Backpack", driver.findElement(By.xpath("//div[@class='inventory_item_name']")).isDisplayed());
    }
}
