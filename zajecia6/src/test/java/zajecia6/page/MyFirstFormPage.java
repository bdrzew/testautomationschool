package zajecia6.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyFirstFormPage {
    private WebDriver driver;

    public MyFirstFormPage(WebDriver driver) {

        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void fillMessageField(String text) {
        driver.findElement(By.id("user-message")).sendKeys(text);
    }

    public void clickShowMessageButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
    }

    public String getMessageDisplayed() {
        return driver.findElement(By.id("display")).getText();
    }

    public void fillAField(String text) {
        driver.findElement(By.id("sum1")).sendKeys(text);
    }

    public void fillBField(String text) {
        driver.findElement(By.id("sum2")).sendKeys(text);
    }

    public String getTotalDisplayed() {
        return driver.findElement(By.id("displayvalue")).getText();
    }

    public void clickGetTotalButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
    }
}
