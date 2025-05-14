package com.thetestingacademy.ex_05TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting023_InvocationCount {

    @Test(invocationCount = 3)
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 2)
    public void test02(){
        System.out.println("Bye");
    }

    @Test(invocationCount = 5)
    public void test03(){
        System.out.println(":)");
    }
}
