package zadanie6.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends  LeftNavigationMenu{
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeUserText() {
        WebElement welcomeUserText = driver.findElement(By.xpath("//p[@class='smallText']"));
        return welcomeUserText.getText();
    }

}
