package test.config;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.authentication.OAuthSignature;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;

import java.util.ResourceBundle;

public abstract class RestTest {
   private ResourceBundle config = ResourceBundle.getBundle("test/config");
   protected RequestSpecification restApi = RestAssured
            .given()
              .baseUri(config.getString("baseUri"))
              .accept(ContentType.JSON)
              .contentType(ContentType.JSON)
              .auth().oauth2(config.getString("token"), OAuthSignature.HEADER);
}
