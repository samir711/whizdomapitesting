package day13.restassureddemo.pojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class AddStudentTest {

    @Test
    public void test002() {

    RestAssured.baseURI = "http://localhost:8080";
    RestAssured.basePath = "/student";

    Student stuObj = new Student("Samir12","Arora","test345@gmail.com","Chemistry");

    stuObj.setCourses("M1");
    stuObj.setCourses("M2");
    stuObj.setCourses("M3");

    given().contentType(ContentType.JSON).log().body().body(stuObj).post();


    }


}
