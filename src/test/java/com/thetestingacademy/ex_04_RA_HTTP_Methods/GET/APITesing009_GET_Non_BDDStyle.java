package com.thetestingacademy.ex_04_RA_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesing009_GET_Non_BDDStyle {


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_GET_Positive(){

        //Given
        String pincode = "560030";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/USA/" + pincode);

        //When
        response = r.when().log().all().get();


        //Then
        vr = response.then().log().all().statusCode(200);



    }

    @Test
    public void test_GET_Negative() {

        //Given
        String pincode = "@";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/USA/" + pincode);

        //When
        response = r.when().log().all().get();


        //Then
        vr = response.then().log().all().statusCode(200);


    }
}
