package org.testing.Testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import io.restassured.http.ContentType;

public class TC_1GetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Response res = 
        given()
        .contentType(ContentType.JSON)
        .when()
        .get("http://localhost:3000/SeleniumStudets");
        System.out.println("Status code is ");
        System.out.println(res.statusCode());
        System.out.println("Response data");
        System.out.println(res.asString());
        }
	}
