package day21.jsonassertexample;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class JsonAssertEx1 {

    @Test
    public void test001() throws IOException {

        RestAssured.baseURI = "http://localhost:8080/student";

        String expected = new String(Files.readAllBytes(Paths.get("data/Json/expected.json")));
        String actual = given().contentType(ContentType.JSON).get("/10").asString();
        JSONAssert.assertEquals(expected,actual, JSONCompareMode.NON_EXTENSIBLE);

//        String actual = "{id:1, name: \"Jhon\", course:\"CSE\", values:[\"x\",\"y\"]}";
//        String expected = "{id:1, name: \"Jhon\", course:\"CSE\", values:[\"x\",\"y\"]}";
//        JSONAssert.assertEquals(expected,actual, JSONCompareMode.STRICT);
    }
}
