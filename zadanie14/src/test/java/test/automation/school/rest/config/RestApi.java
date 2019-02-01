package test.automation.school.rest.config;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.authentication.OAuthSignature;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;

import java.util.ResourceBundle;

public abstract class RestApi {
    private ResourceBundle config = ResourceBundle.getBundle("config");
    protected RequestSpecification restApi = RestAssured
            .given()
            .baseUri(config.getString("baseUri"))
            .accept(ContentType.JSON)
            .contentType(ContentType.JSON)
            .auth().oauth2(config.getString("baseToken"), OAuthSignature.HEADER)
            .log().all();
}
