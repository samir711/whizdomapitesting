package day23.hamcrestvalidationEx2;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class HamercrestValidationEx2 {

    @BeforeMethod
    public  void init()
    {
        RestAssured.baseURI = "http://private-044e07-softechwalmartapi.apiary-mock.com/get";
    }

    @Test
    public void test001(){

        given().get().then().body("numItems", lessThanOrEqualTo(10),
                             "numItems", lessThan(9),
                                     "numItems", greaterThanOrEqualTo(11),
                                     "query", equalToIgnoringCase("IPOD"));
    }



}
