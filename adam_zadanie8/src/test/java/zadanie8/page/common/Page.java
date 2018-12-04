package zadanie8.page.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import zadanie8.assertion.common.Assertion;

public abstract class Page {
protected WebDriver driver;

public Page(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
public <G extends Page, T extends Assertion<G>> T check(Class<T> clazz) throws RuntimeException {
    try {
        Assertion<G> assertion = clazz.newInstance();
        assertion.setPage((G)this);
        return (T) assertion;
    } catch (InstantiationException | IllegalAccessException e){
        throw new RuntimeException("Error occur during creating Assertions.", e);
    }
}
}