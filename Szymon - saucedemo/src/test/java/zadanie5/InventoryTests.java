package zadanie5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;


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
    }
    @Before
    public void testSetup(){
        driver.get("https://www.saucedemo.com");
        login();
    }
    @After
    public void testTeardown (){
        logout();
            }
    @AfterClass
    public static void classTeardown(){
        driver.quit();
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]/../..//button")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        assertEquals("Sauce Labs Backpack", driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText());
        driver.findElement(By.xpath("//a[@class='cart_checkout_link']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Jan");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Nowak");
        driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("34-400");
        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();

        assertThat(driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText()).contains("32.39");
        //TODO: wiecej asserji albo wiecej testow

        sleepToSee(3);
        assertTrue( true );
    }

    //test na sprawdzenie ilości rzeczy w koszyku numerkiem przy koszyku i później w koszyku druga asercja

    //test na sprawdzenie sumy kasy w koszyku przy kilku produktach

    //test na dodanie do koszyka kilku rzeczy i usunięcie dwóch




    public static void sleepToSee(int seconds){
        seconds = seconds*1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void login (){
        WebElement usernameField = driver.findElement(By.xpath("//input[@type='text']"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }

    public void openHamburgerMenu() {
        driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
    }
    public void logout () {
        openHamburgerMenu();
        new WebDriverWait(driver,10 )
//                .until((ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")))).click();
                .until((ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")))).click();
    }
}

