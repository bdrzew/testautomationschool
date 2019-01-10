package zadanie10.page.common;

import org.openqa.selenium.WebDriver;
import zadanie10.page.component.HeaderComponent;

public class MainPage extends Page {
    private HeaderComponent header;

    public MainPage(WebDriver driver) {
        super(driver);
        header = new HeaderComponent(driver);
    }

    public HeaderComponent getHeader() {
        return header;
    }
}

