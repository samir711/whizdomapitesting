package day17.restassureddemo.extractingvalue;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class JSONextractionex3 {

    @Test
    public void getStudents() {
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        Response resp = given().log().all().contentType(ContentType.JSON).get("/list");

        JsonPath extractor = resp.jsonPath();

        ArrayList<Integer> id = extractor.get("id");
        ArrayList<String> firstName = extractor.get("firstName");
        ArrayList<String> lastName = extractor.get("lastName");
        ArrayList<String> programme = extractor.get("programme");
        ArrayList<String> email = extractor.get("email");
      //  ArrayList<String> listOfCourses = extractor.get("courses");

        for(int i = 0; i < id.size();i++) {
            //System.out.println(i);
            System.out.println(id.get(i));
            System.out.println(firstName.get(i));
            System.out.println(lastName.get(i));
            System.out.println(email.get(i));
            System.out.println(programme.get(i));
            System.out.println("********************************************");
        }

        System.out.println("Student Id  is : " + id);
        System.out.println("The Student First name is : " +firstName);
        System.out.println(" The Student Last name is : " +lastName);
        System.out.println("        programme name is : " + programme);
        System.out.println("      The courses name is : " + email);

//        for(String s : listOfCourses) {
//            System.out.println(s);
//        }
        }

       /* resp.prettyPt();
        System.out.println(resp.statusCode());*/


}
