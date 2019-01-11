package day22.hamcrestvalidationEx1;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class HamcrestValidationEx1 {

    @BeforeMethod
    public  void init()
    {
        RestAssured.baseURI = "http://private-044e07-softechwalmartapi.apiary-mock.com/get";
     }

     @Test
     public void test001(){

       // given().contentType(ContentType.JSON).get().prettyPrint();
       given().get().then().body("query", equalTo("ipod"));
       given().get().then().body("query", equalToIgnoringCase("IPOD"));
     }

     @Test
     public void test002(){

      given().get().then().body("numItems", lessThanOrEqualTo(10));
     }

    @Test
    public void test003(){

        given().get().then().body("items.name", hasItem("Apple iPod touch 128GB"));
    }

//    @Test
//    public void test004(){
//
//        given().get().then().body("items[0].giftOptions", hasEntry("allowGiftReceipt","false"));
//
//    }

    @Test
    public void test005(){

        given().get().then().body("items[0].giftOptions", hasKey("allowGiftMessage"));

    }



    @Test
    public void test006(){

        given().get().then().body("items.findAll{it.name=='Apple iPod touch 128GB'}",hasItems(hasEntry("stock","Available")));

    }

}
