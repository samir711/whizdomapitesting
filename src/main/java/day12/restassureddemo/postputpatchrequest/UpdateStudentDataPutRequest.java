package day12.restassureddemo.postputpatchrequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class UpdateStudentDataPutRequest {

    @Test
    public void UpdateStudentInfoThroughPutRequest() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student/103";
        String jsonPath = "data/Json/updatestudentdataputrequest.json";

        File jsonFile = new File(jsonPath);
        Response resp = given().contentType(ContentType.JSON).log().body().body(jsonFile).put();
        resp.prettyPrint();

    }



}
