package school.testautomation.test;

import com.github.javafaker.Faker;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import school.testautomation.page.RegisterErrorPage;
import school.testautomation.page.RegisterPage;
import school.testautomation.page.RegisterSummaryPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegisterTest extends BaseTest {
    RegisterPage registerPage;
    RegisterErrorPage registerErrorPage;
    RegisterSummaryPage registerSummaryPage;
    Faker faker;

    @BeforeMethod
    public void beforeTest() {
        registerPage = new RegisterPage(driver);
        registerErrorPage = new RegisterErrorPage(driver);
        registerSummaryPage = new RegisterSummaryPage(driver);
        faker = new Faker();
    }

    @Test
    public void shouldRegister() {
        registerPage.openRegisterPage()
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setStreet(faker.address().streetAddress())
                .setCity(faker.address().city())
                .setState(faker.address().state())
                .setZipCode(faker.address().zipCode())
                .setPhoneNumber(faker.phoneNumber().phoneNumber())
                .setSsn(faker.idNumber().ssnValid())
                .setUsername(faker.name().username())
                .setPassword("pass1")
                .setRepeatedPassword("pass1")
                .clickRegisterButton(false);

        assertTrue(registerSummaryPage.isUserLoggedIn());
    }

    @Test
    public void shouldNotRegisterUsernameMissing() {
        registerPage.openRegisterPage()
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setStreet(faker.address().streetAddress())
                .setCity(faker.address().city())
                .setState(faker.address().state())
                .setZipCode(faker.address().zipCode())
                .setPhoneNumber(faker.phoneNumber().phoneNumber())
                .setSsn(faker.idNumber().ssnValid())
                .setUsername("")
                .setPassword("pass1")
                .setRepeatedPassword("pass1")
                .clickRegisterButton(true);

        assertEquals(registerErrorPage.getUsernameError(),"Username is required.");
    }

    @Test
    public void shouldNotRegisterRepeatedPasswordNotTheSame() {
        registerPage.openRegisterPage()
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setStreet(faker.address().streetAddress())
                .setCity(faker.address().city())
                .setState(faker.address().state())
                .setZipCode(faker.address().zipCode())
                .setPhoneNumber(faker.phoneNumber().phoneNumber())
                .setSsn(faker.idNumber().ssnValid())
                .setUsername(faker.name().username())
                .setPassword("pass1")
                .setRepeatedPassword("pass2")
                .clickRegisterButton(true);

        assertEquals(registerErrorPage.getRepeatedPasswordError(),"Passwords did not match.");
    }
}