package day11.restassureddemo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllStudent {


    @Test
    public void getStudents() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

        RequestSpecification req = given();
        req.given(); // Pre Conditions
        req.contentType(ContentType.JSON); // Setting content Type
        req.header("A","B"); // Setting the header
        req.log().all(); //logging

        Response resp = req.get("/list");
        System.out.println(resp.getHeaders());
        System.out.println(resp.getTime());
        System.out.println(resp.statusCode());









    }



}
