package test.automation.school.rest.scenario;

import test.automation.school.rest.config.RestApi;
import test.automation.school.rest.model.Lead;

import static org.hamcrest.core.IsEqual.equalTo;

public class CreateLeadScenario extends RestApi {

    public void createLead(Lead lead) {

        restApi
                .when()
                    .content(lead)
                    .post("/v2/leads")
                .then()
                    .statusCode(200);
    }

}
