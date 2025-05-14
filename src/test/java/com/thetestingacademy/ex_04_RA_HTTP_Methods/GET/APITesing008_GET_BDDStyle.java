package com.thetestingacademy.ex_04_RA_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesing008_GET_BDDStyle {

    @Test
    public void test_GET_Positive(){

        String pincode = "560030";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/" + pincode)
                .when()
                    .log()
                    .all()
                    .get()
                .then()
                    .log().all().statusCode(200);


    }
}
