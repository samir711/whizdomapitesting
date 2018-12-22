package day13.restassureddemo.pojoExp1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddStudentTest {

    @Test
    public void test002() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        StudentOne stuObj = new StudentOne("Samir12", "Arora", "test1345@gmail.com", "Chemistry");
        Course cu = new Course("java",80);
        //Course cu1 = new Course("csharp",90);

        stuObj.setCourses(cu);
       //  stuObj.setCourses(cu1);



        given().contentType(ContentType.JSON).log().body().body(stuObj).post();
    }
}