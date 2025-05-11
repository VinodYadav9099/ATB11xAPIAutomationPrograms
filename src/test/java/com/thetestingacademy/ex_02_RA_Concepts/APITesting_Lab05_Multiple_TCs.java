package com.thetestingacademy.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab05_Multiple_TCs {
    public static void main(String[] args) {
        String pincode = "560030";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .when()
                .get()
                .then()
                .log().all().statusCode(201);

       pincode = "@";
       RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .when()
                .get()
                .then()
                .log().all().statusCode(201);

        pincode = "470090";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .when()
                .get()
                .then()
                .log().all().statusCode(201);

    }
}
