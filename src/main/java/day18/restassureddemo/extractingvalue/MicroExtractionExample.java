package day18.restassureddemo.extractingvalue;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class MicroExtractionExample {

    @Test
    public void test001() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        String query = resp.then().extract().path("query");
        System.out.println("Name of the query is : " + query);
        System.out.println("____________________________________________________________________");
    }

    @Test
    public void test002() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        String name1 = resp.then().extract().path("items[0].name");
        System.out.println("Name of the first item is : " + name1);
        System.out.println("____________________________________________________________________");
    }

    @Test
    public void test003() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        String name1 = resp.then().extract().path("items[0].name");
        ArrayList<String> allNames = resp.then().extract().path("items.name");
        // System.out.println(allNames);

        for (String s : allNames) {
            System.out.println(s);
        }
        System.out.println("____________________________________________________________________");
    }

    @Test
    public void test004() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        int i = resp.then().extract().path("items.size()");
        System.out.println(i);
        System.out.println("____________________________________________________________________");
    }

    @Test
    public void test005() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        HashMap<String, String> giftOptions = resp.then().extract().path("items[0].giftOptions");
        System.out.println(giftOptions);
        System.out.println("____________________________________________________________________");
    }

    //find -
    //findAll -


    @Test
    public void test006() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        int itemid = resp.then().extract().path("items.find{it.name == 'Apple iPod touch 128GB'}.itemId");
        System.out.println("Item id of Apple iPod touch 128GB is " + itemid);
        System.out.println("____________________________________________________________________");

    }

    @Test
    public void test007() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        ArrayList<HashMap<String,Object>> list1 = resp.then().extract().path("items.findAll{it.name == 'Apple iPod touch 128GB'}");
        System.out.println("All Info :  " + list1);
        System.out.println("____________________________________________________________________");

    }

    @Test
    public void test008() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        ArrayList<String> name1 = resp.then().extract().path("items.findAll{it.salePrice < 200}.name");
        System.out.println("Items having sales price below 200 USD :  " + name1);
        System.out.println("____________________________________________________________________");

    }

    @Test
    public void test009() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        ArrayList<Integer> msrp = resp.then().extract().path("items.findAll{it.name ==~/App.*/}.msrp");
        System.out.println("MSRP value :  " + msrp);
        System.out.println("____________________________________________________________________");

    }

    @Test
    public void test009a() {

        RestAssured.baseURI = "https://private-8a97bf-whizdommockservice.apiary-mock.com/Search";
        Response resp = RestAssured.given().contentType(ContentType.JSON).get();
        ArrayList<Float> salesPrice = resp.then().extract().path("items.findAll{it.name ==~/.*ed/}.salePrice");
        System.out.println("SalesPrice value :  " + salesPrice);
        System.out.println("____________________________________________________________________");

    }

}