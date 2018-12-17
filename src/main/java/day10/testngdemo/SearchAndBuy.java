package day10.testngdemo;

import org.testng.annotations.*;

public class SearchAndBuy {

    @BeforeTest
    public void init() {
        System.out.println("Before Test.....");
    }

    @AfterTest
    public void flush() {
        System.out.println("flushing Test ............");
    }

    @BeforeMethod
    public void before() {
        System.out.println("Before each test.....");

    }

    @AfterMethod
    public void after() {
        System.out.println("After each test.....");

    }

    @Test(priority = 1)
    public void Search() {
        System.out.println("Search..............");

    }
    @Test(priority = 2)
    public void addToCart() {

        System.out.println("addToCart...........");

    }
    @Test(priority = 3)
    public void CheckOut() {

        System.out.println("CheckOut............");


    }


}
