package day13.restassureddemo.usingcollectionobjects;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class AddNewStudentUsingCollections {

    @Test
    public void test002() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("firstName","Sam");
        map.put("lastName","Thomas");
        map.put("email","abc123@test.com");
        map.put("programme","abc");

        ArrayList<String> list = new ArrayList<String>();
        list.add("M1");
        list.add("M2");
        list.add("M3");

        map.put("courses",list);

        given().contentType(ContentType.JSON).log().body().body(map).post();


    }
}
