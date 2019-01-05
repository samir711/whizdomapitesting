package day17.restassureddemo.extractingvalue;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class JSONextractionex1 {

    @Test
    public void getStudents() {
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        Response resp = given().log().all().contentType(ContentType.JSON).get("/1");
        int id = resp.then().extract().path("id");
        String firstName = resp.then().extract().path("firstName");
        String lastName = resp.then().extract().path("lastName");
        String programme = resp.then().extract().path("programme");
        String email = resp.then().extract().path("email");
        ArrayList<String> coursesList = resp.then().extract().path("courses");

        System.out.println("Student Id  is : " + id);
        System.out.println("The Student First name is : " +firstName);
        System.out.println(" The Student Last name is : " +lastName);
        System.out.println("        programme name is : " + programme);
        System.out.println("      The courses name is : " + email);

        for(String s : coursesList) {
            System.out.println(s);
        }

       /* resp.prettyPt();
        System.out.println(resp.statusCode());*/
    }


}
