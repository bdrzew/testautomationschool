package test;

import test.config.RestTest;
import org.testng.annotations.Test;


import static org.hamcrest.core.IsEqual.equalTo;

public class MyRestTest extends RestTest {

    @Test
    public void getTasksVerification() {
        restApi
                .when()
                  .get("/v2/tasks/51059740")
                .then()
                  .statusCode(200)
                  .body("data.id", equalTo(51059740));
    }

    @Test
    public void getTasksVerification2() {
        restApi
                .when()
                  .get("/v2/tasks/51059740")
                .then()
                  .statusCode(200)
                  .body("data.id", equalTo(51059740));
    }
}
