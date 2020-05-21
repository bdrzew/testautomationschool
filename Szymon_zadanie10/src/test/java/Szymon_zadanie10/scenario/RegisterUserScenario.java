package Szymon_zadanie10.scenario;

import Szymon_zadanie10.model.User;
import Szymon_zadanie10.page.accountRelated.MyAccountPage;
import Szymon_zadanie10.page.firstPage.FirstPage;
import Szymon_zadanie10.scenario.common.Scenario;

public class RegisterUserScenario implements Scenario<FirstPage, MyAccountPage> {

    private User user;

    public RegisterUserScenario(User user) {
        this.user = user;
    }

    @Override
    public MyAccountPage run(FirstPage firstPage) {
        return firstPage
                .getHeaderComponent()
                .clickSignIn()
                .enterEmailCreate(this.user.getEmail())
                .clickCreateAnAccountButtonAndRedirect()
                .selectTitleMr()
                .enterFirstName(this.user.getFirstName())
                .enterLastName(this.user.getLastName())
                .enterPassword(this.user.getPassword())
                .selectDateOfBirthDay(this.user.getDateOfBirthDay())
                .selectDateOfBirthMonth(this.user.getDateOfBirthMonth())
                .selectDateOfBirthYear(this.user.getDateOfBirthYear())
                .enterAddress(this.user.getAddressStreet())
                .enterCity(this.user.getCity())
                .selectState(this.user.getState())
                .enterZipCode(this.user.getZipCode())
                .enterMobilePhone(this.user.getMobilePhone())
                .clickRegisterButton();
    }
}

