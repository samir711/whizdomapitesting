package day17.restassureddemo.extractingvalue;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class JSONextractionex2 {

    @Test
    public void getStudents() {
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        Response resp = given().log().all().contentType(ContentType.JSON).get("/1");

        JsonPath extractor = resp.jsonPath();

        int id = extractor.get("id");
        String firstName = extractor.get("firstNme");
        String lastName = extractor.get("lastName");
        String programme = extractor.get("programme");
        String email = extractor.get("email");
        ArrayList<String> listOfCourses = extractor.get("courses");

        System.out.println("Student Id  is : " + id);
        System.out.println("The Student First name is : " +firstName);
        System.out.println(" The Student Last name is : " +lastName);
        System.out.println("        programme name is : " + programme);
        System.out.println("      The courses name is : " + email);

        for(String s : listOfCourses) {
            System.out.println(s);
        }
        }

       /* resp.prettyPt();
        System.out.println(resp.statusCode());*/


}
