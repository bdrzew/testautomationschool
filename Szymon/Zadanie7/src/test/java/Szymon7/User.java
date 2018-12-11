package Szymon7;

import org.apache.commons.lang3.RandomStringUtils;

public class User {

    private String username;
    private String firstName = "Jan";
    private String lastName = "Nowak";
    private String address = "Nadwodnia 22";
    private String city = "Kraków";
    private String state = "małopolska";
    private String zipCode = "34-400";
    private String phone = "666222777";
    private String sSN = "123465";
    private String password = "secretPass";
    private String passwordAgain = "secretPass";

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        String randomString = RandomStringUtils.randomAlphanumeric(5);
        username = "user_" + randomString;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSSN() {
        return sSN;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordAgain() {
        return passwordAgain;
    }

    public void setPasswordAgain(String passwordAgain) {
        this.passwordAgain = passwordAgain;
    }
}