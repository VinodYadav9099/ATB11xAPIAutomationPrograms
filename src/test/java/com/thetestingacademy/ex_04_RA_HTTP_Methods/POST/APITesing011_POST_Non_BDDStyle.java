package com.thetestingacademy.ex_04_RA_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesing011_POST_Non_BDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_POST_NonBDD_CreateToken(){

        //Given
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println(" ----    Part 1 ---- ");

        // Part 1 - Pre Condition - Preparing Request - URL, Headers, Auth...

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();


        System.out.println(" ----    Part 2 ---- ");

        // Making HTTP Request -> Part 2
        //When
        response = r.when().log().all().post();


        System.out.println(" ----    Part 3 ---- ");

        // Verification Part -> Part 3
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
