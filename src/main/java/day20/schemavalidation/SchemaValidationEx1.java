package day20.schemavalidation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class SchemaValidationEx1 {

    @Test
    public void test001() {
        RestAssured.baseURI = "http://localhost:8080/student";

        File schema = new File("data/Json/schema.json");

        given().contentType(ContentType.JSON).get("/10").then().body(matchesJsonSchema(schema));



    }
}
