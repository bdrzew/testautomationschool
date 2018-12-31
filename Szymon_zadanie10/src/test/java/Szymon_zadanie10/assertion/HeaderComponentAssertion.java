package Szymon_zadanie10.assertion;

import Szymon_zadanie10.assertion.common.Assertion;
import Szymon_zadanie10.page.component.HeaderComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

public class HeaderComponentAssertion extends Assertion<HeaderComponent> {
    private WebDriver driver;

    public HeaderComponentAssertion verifyLoggedInUserByName(String firstAndLastName) {
        assertEquals(page.getFirstAndLastNameField().getText(), firstAndLastName);
        return this;
    }

    public HeaderComponentAssertion verifyMainCategories(List<String> expectedCategories) {
        List<String> actualMainCategories = page.getMainCategories().stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        assertEquals(actualMainCategories, expectedCategories);
        return this;
    }

    public HeaderComponentAssertion verifyDressesCategories(List<String> expectedDressesCategories) {
//        Actions action = new Actions(driver);
////        WebElement we = driver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
////        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/expression-here"))).click().build().perform();
//        action.moveToElement(page.getDressesCategoriesField())
//                .moveToElement(page.getDressesCategories().get(1))
//                .build().perform();

        List<String> actualDressesCategories = page.getDressesCategories().stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        assertEquals(actualDressesCategories, expectedDressesCategories);
        return this;
    }


}