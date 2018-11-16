package zajecia6.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstFormPage {
    private WebDriver driver;

    public FirstFormPage(WebDriver driver) {

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
}
