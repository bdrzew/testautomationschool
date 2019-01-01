package Szymon_zadanie10.page.common;

import Szymon_zadanie10.page.component.AddToCartPopUpComponent;
import Szymon_zadanie10.page.component.ContextMenuComponent;
import Szymon_zadanie10.page.component.HeaderComponent;
import Szymon_zadanie10.page.component.ProductOptionsComponent;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStorePage extends Page {
    private HeaderComponent header;
    private ProductOptionsComponent productOptionsComponent;
    private AddToCartPopUpComponent addToCartPopUpComponent;
    private ContextMenuComponent contextMenuComponent;

    public AbstractStorePage(WebDriver driver) {
        super(driver);
        header = new HeaderComponent(driver);
        productOptionsComponent = new ProductOptionsComponent(driver);
        addToCartPopUpComponent = new AddToCartPopUpComponent(driver);
        contextMenuComponent = new ContextMenuComponent(driver);
    }

    public HeaderComponent getHeaderComponent(){
        return header;
    }

    public ProductOptionsComponent getProductOptionsComponent() {
        return productOptionsComponent;
    }

    public AddToCartPopUpComponent getAddToCartPopUpComponent() {
        return addToCartPopUpComponent;
    }

    public ContextMenuComponent getContextMenuComponent(){
        return contextMenuComponent;
    }
}
