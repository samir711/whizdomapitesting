package day13.restassureddemo.pojoExp3;

import day13.restassureddemo.pojoExp2.StudentOne;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddStudentTest {

    @Test
    public void test002() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        Student stuObj = new Student("Samir12", "Arora", "test6345@gmail.com", "Chemistry");

        Courses[] course = new Courses[]{
                new Courses("Java",80),
                new Courses("Python",70),
                new Courses("Csharpe",80),
                new Courses("Scala",75),

        };

        stuObj.setCourses(course);
//        stuObj.addCourses("java",90);
//        stuObj.addCourses("Csharpe",80);
//        stuObj.addCourses(".Net",70);
//        stuObj.addCourses("Python",60);




        given().contentType(ContentType.JSON).log().body().body(stuObj).post();
    }
}