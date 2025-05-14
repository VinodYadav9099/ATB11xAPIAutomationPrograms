package com.thetestingacademy.ex_05TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting021_Enabled {

    @Test(enabled = false)
    public void test01() {
        Assert.assertTrue(true);
    }

    @Test
    public void test02() {
        Assert.assertTrue(true);
    }

    @Test
    public void test03() {
        Assert.assertTrue(true);
    }
}
