package day13.restassureddemo.pojoExp2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddStudentTest {

    @Test
    public void test002() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        StudentOne stuObj = new StudentOne("Samir12", "Arora", "test5345@gmail.com", "Chemistry");


        stuObj.addCourses("java",90);
        stuObj.addCourses("Csharpe",80);
        stuObj.addCourses(".Net",70);
        stuObj.addCourses("Python",60);




        given().contentType(ContentType.JSON).log().body().body(stuObj).post();
    }
}