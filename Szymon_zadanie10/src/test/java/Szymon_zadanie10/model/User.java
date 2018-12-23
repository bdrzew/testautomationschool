package Szymon_zadanie10.model;

import org.apache.commons.lang3.RandomStringUtils;

public class User {
    private String email; //TODO: zaciągać userów z zewnętrznej biblioteki
    private String firstName = "Jan";
    private String lastName = "Nowak";
    private String password = "randomPASS123";
    private String dateOfBirthDay = "5";
    private String dateOfBirthMonth = "2";
    private String dateOfBirthYear = "1986";
    private String addressStreet = "Nadwodnia 19";
    private String city = "Kraków";
    private String state = "1";
    private String zipCode = "34400";
    private String mobilePhone = "111333444";

    public String getEmail() {
        return email;
    }

    public void setRandomEmail() {
        String randomString = RandomStringUtils.randomAlphanumeric(5);
        this.email = randomString+"@wp.pl";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(String dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public String getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public void setDateOfBirthMonth(String dateOfBirthMonth) {
        this.dateOfBirthMonth = dateOfBirthMonth;
    }

    public String getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public void setDateOfBirthYear(String dateOfBirthYear) {
        this.dateOfBirthYear = dateOfBirthYear;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

}