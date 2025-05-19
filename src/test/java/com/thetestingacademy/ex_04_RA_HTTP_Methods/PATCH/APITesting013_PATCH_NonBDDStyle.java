package com.thetestingacademy.ex_04_RA_HTTP_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting013_PATCH_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_patch_non_bdd() {

        String token = "0af0fedeb84fe50";
        String bookingid = "500";

        String payloadPatch = "{\n" +
                "    \"firstname\" : \"Vinod\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
//        r.auth().oaut
        r.cookie("token", token);
        r.body(payloadPatch).log().all();

        response = r.when().log().all().patch();


        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
