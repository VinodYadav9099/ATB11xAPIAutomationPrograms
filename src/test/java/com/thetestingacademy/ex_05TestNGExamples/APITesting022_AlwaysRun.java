package com.thetestingacademy.ex_05TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting022_AlwaysRun {

    @Test
    public void test_new_registration() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal() {
        Assert.assertTrue(true);
    }
}
