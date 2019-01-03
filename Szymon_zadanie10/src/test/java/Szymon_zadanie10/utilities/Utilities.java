package Szymon_zadanie10.utilities;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class Utilities {

    /*
        find WebElement in a List<WebElement> by text
        czy ta klasa potrzebuje drivera?
     */
    public WebElement findElementByText(List<WebElement> webElements, String text) {
        return webElements
                .stream()
                .filter(webElement -> Objects.equals(webElement.getText(), text))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No WebElement found containing " + text));
    }
}
