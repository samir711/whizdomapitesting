package day12.restassureddemo.postputpatchrequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class UpdateStudentInfoPatchRequest {

    @Test
    public void UpdateStudentInfoThroughPatch() {

         /*
         * Patch request does not require complete JSON body
         * It require only JSON field which needs to be updated.
         *
         * */
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student/103";
        String jsonPath = "data/Json/updatestudentdatapatchrequest.json";

        File jsonFile = new File(jsonPath);
        Response resp = given().contentType(ContentType.JSON).log().body().body(jsonFile).patch();
        resp.prettyPrint();

    }

}
