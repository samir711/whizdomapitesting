package day12.restassureddemo.postputpatchrequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class AddNewStudentPostRequest {

    @Test
    public void addStudent() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";
        String jsonPath = "data/Json/studentdata.json";

        File jsonFile = new File(jsonPath);
        given().contentType(ContentType.JSON).log().body().body(jsonFile).post();


    }
}
