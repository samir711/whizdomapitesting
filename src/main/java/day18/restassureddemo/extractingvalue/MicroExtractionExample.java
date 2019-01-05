package day18.restassureddemo.extractingvalue;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class MicroExtractionExample {

    @Test
    public void test001() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        String query = resp.then().extract().path("query");
        System.out.println("Name of the query is : " + query);
    }

    @Test
    public void test002() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        String name1 = resp.then().extract().path("items[0].name");
        System.out.println("Name of the first item is : " + name1);

      }
    @Test
    public void test003() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        String name1 = resp.then().extract().path("items[0].name");
        ArrayList<String> allNames = resp.then().extract().path("items.name");
       // System.out.println(allNames);

        for(String s : allNames)
        {
            System.out.println(s);
        }
    }
}


