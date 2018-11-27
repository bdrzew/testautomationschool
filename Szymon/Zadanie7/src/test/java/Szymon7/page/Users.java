package Szymon7.page;

import org.apache.commons.lang3.RandomStringUtils;

public class Users {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        String randomString = RandomStringUtils.randomAlphanumeric(5);
        username = "user_" + randomString;
    }

}
