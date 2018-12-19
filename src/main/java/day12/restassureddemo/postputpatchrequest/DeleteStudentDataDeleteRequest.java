package day12.restassureddemo.postputpatchrequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteStudentDataDeleteRequest {

    @Test
    public void DeleteStudentData() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student/103";
        Response response = given().contentType(ContentType.JSON).delete();
        response.prettyPrint();
    }
}
