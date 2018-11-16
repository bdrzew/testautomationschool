package zajecia6.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllFormPage {
    private WebDriver driver;

    public AllFormPage(WebDriver driver) {

        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void fillFirstFormMessageField(String text) {
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

    public void enterValueA(int firstNumber) {
        driver.findElement(By.id("sum1")).sendKeys(String.valueOf(firstNumber));
    }

    public void enterValueB(int secondNumber) {
        driver.findElement(By.id("sum2")).sendKeys(String.valueOf(secondNumber));
    }

    public void clickGetTotalButton() {
        driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
    }

    public int getTotalValue() {
        return Integer.valueOf(driver.findElement(By.id("displayvalue")).getText());
    }
}
