package Szymon_zadanie10.page.common;

import Szymon_zadanie10.page.common.Page;
import Szymon_zadanie10.page.component.HeaderComponent;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStorePage extends Page {
    private HeaderComponent header;

    public AbstractStorePage(WebDriver driver) {
        super(driver);
        header = new HeaderComponent(driver);
    }

    public HeaderComponent getHeaderComponent(){
        return header;
    }
}
