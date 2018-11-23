package org.testautomation.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testautomation.page.ChooseFlightPage;
import org.testautomation.page.FlightOptionsPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookFlightTest extends SeleniumTest {
    @BeforeMethod
    public void xsetup() {
        new ChooseFlightPage(driver, "http://www.blazedemo.com")
                .selectDepartureCity("San Diego")
                .selectDestinationCity("Dublin")
                .clickFindFlights();

    }
    @Test
    public void bookFlightVerify(){
        new FlightOptionsPage(driver)
                .clickFlightButton(1)
                .setUserName("Adam")
                .clickPurchaseFlight()
                .assertTextIsPresent("Thank you");
    }

}
