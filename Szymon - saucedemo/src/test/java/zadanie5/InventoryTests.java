package zadanie5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class InventoryTests {
    static WebDriver driver;

    @BeforeClass
    public static void classSetup (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        login();
    }
    @Before
    public void testSetup(){
        driver.get("https://www.saucedemo.com/inventory.html");
    }
    @After
    public void testTeardown (){
        openHamburgerMenu();
        resetAppState();
            }
    @AfterClass
    public static void classTeardown(){
        driver.quit();
    }

    @Test
    public void buyOneItemVerifyPriceTest()
    {
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]/../../following-sibling::div//button")).click();
        goToShoppingCartContainerStep1();
        assertEquals("backpack is not in container", "Sauce Labs Backpack", driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText());

        goToCartCheckoutStep2();
        fillYourInformationStep3();
        goToOverviewStep4();
        assertEquals("Total value is not correct for one backpack", "Total: $32.39", driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText());

        goToCheckoutCompleteStep5();
        assertEquals("order is not complete or thank you text changed", "THANK YOU FOR YOUR ORDER", driver.findElement(By.xpath("//h2[@class='complete-header']")).getText());
    }

    @Test
    public void buyFewAndVerifyContainerTest(){
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]/../../following-sibling::div//button")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bike Light')]/../../following-sibling::div//button")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]/../../following-sibling::div//button")).click();
        goToShoppingCartContainerStep1();
        String cartList = driver.findElement(By.xpath("//div[@class='cart_list']")).getText();
        assertThat(cartList).contains("Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt");
    }

    @Test
    public void buyFewAndVerifySumTest(){
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]/../../following-sibling::div//button")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bike Light')]/../../following-sibling::div//button")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]/../../following-sibling::div//button")).click();
        goToShoppingCartContainerStep1();
        goToCartCheckoutStep2();
        fillYourInformationStep3();
        goToOverviewStep4();
        assertEquals("Total value is not correct for three items", "Total: $60.45", driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText());
    }



    public static void sleepToSee(int seconds){
        seconds = seconds*1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void login(){
        WebElement usernameField = driver.findElement(By.xpath("//input[@type='text']"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }
    private static void openHamburgerMenu() {
        driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
    }
    private static void logout() {
        openHamburgerMenu();
        WebElement logoutSidebarLink = driver.findElement(By.id("logout_sidebar_link"));
        new WebDriverWait(driver, 5)
                .until(p -> logoutSidebarLink.getLocation().x > 0);
        logoutSidebarLink.click();
    }
    private void goToShoppingCartContainerStep1 (){
        driver.findElement(By.id("shopping_cart_container")).click();
    }
    private void goToCartCheckoutStep2 (){
        driver.findElement(By.xpath("//a[@class='cart_checkout_link']")).click();
    }
    private void fillYourInformationStep3 (){
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Jan");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Nowak");
        driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("34-400");
    }
    private void goToOverviewStep4 () {
        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
    }
    private void goToCheckoutCompleteStep5 (){
        driver.findElement(By.xpath("//a[@class='cart_checkout_link']")).click();
    }
    private void resetAppState (){
        WebElement resetAppStateLink = driver.findElement(By.xpath("//a[@id='reset_sidebar_link']"));
        new WebDriverWait(driver, 5)
                .until(p -> resetAppStateLink.getLocation().x > 0);
        resetAppStateLink.click();
    }
}

