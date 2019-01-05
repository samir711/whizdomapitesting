package day18.restassureddemo.extractingvalue;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class TestMock {

    @Test
    public void testmockservice() {

        //RestAssured.baseURI = "http://private-8a97bf-whizdommockservice.apiary-mock.com/questions";
        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";

        RestAssured.given().contentType(ContentType.JSON).get().prettyPrint();


    }
}
