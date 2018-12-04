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

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getSSN() {
        return sSN;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordAgain() {
        return passwordAgain;
    }
}