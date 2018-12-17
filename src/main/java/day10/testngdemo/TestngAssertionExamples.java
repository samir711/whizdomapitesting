package day10.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAssertionExamples {

    @Test
    public void testAssertions() {

//        Assert.assertEquals("ABC","ABC"); //PASS
//        Assert.assertEquals("ABC","ABCD"); //FAIL
//        Assert.assertEquals("ABC","ABC"); //PASS
//        Assert.assertEquals("ABC","USG"); //FAIL
//        Assert.assertEquals("ABC","ABC"); //PASS

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("ABC","ABC"); //PASS
        softAssert.assertEquals("ABC","ABCD"); //FAIL
        softAssert.assertEquals("ABC","ABC"); //PASS
        softAssert.assertEquals("ABC","USG"); //FAIL
        softAssert.assertEquals("ABC","ABC"); //PASS

        softAssert.assertAll();

    }


}
