package com.thetestingacademy.ex_06_TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting027_TestNG_Assertions {

    @Test(enabled = false)
    public void test_HardAssertion_Example(){
        System.out.println("Start of the Program");
        Boolean is_neeru_male = false;
        Assert.assertEquals("pramod", "Vinod");
        System.out.println("End of the Program");
    }

    // Software Assertion

    @Test
    public void test_softAssertExample() {
        System.out.println("Start of the 2nd TC SA");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Vinod", "Yadav");
        System.out.println("The Continuos exection");
        softAssert.assertAll();
    }
}
