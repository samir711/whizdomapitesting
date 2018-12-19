package day11.restassureddemo.getrequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllStudentsBetterWay {

    @Test
    public void getStudents() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        Response resp = given().contentType(ContentType.JSON).header("A", "B")
        .log().all().get("/list");
        resp.prettyPrint();



    }

}
