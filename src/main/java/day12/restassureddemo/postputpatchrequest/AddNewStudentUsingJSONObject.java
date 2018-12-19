package day12.restassureddemo.postputpatchrequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddNewStudentUsingJSONObject {

    @Test
    public void AddStudentByJasonObject() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("firstName","Samir");
        jsonObject.put("lastName","Arora");
        jsonObject.put("email ","samirdoc1@yahoo.com");
        jsonObject.put("programme","ComputerScience");

        JSONArray courses = new JSONArray();
        courses.put("M1");
        courses.put("M2");
        courses.put("M3");
        jsonObject.put("courses",courses);

        given().contentType(ContentType.JSON).log().body().body(jsonObject.toString()).post();

    }


}
