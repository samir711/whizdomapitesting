package day13.restassureddemo.pojoExp4;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddStudentTest {

    @Test
    public void test002() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";
        Student stuObj = new Student("samir13","Arora","test8345@gmail.com","Physics");

        Course cu = stuObj.addCourse("Java","70");

        cu.setTopics("DS1");
        cu.setTopics("DS2");
        cu.setTopics("DS3");
        Course cu1 = stuObj.addCourse("Python","70");

        cu1.setTopics("PS1");
        cu1.setTopics("PS2");
        cu1.setTopics("PS3");

  given().contentType(ContentType.JSON).log().body().body(stuObj).post();
    }
}