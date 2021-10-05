package com.restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Baseclass {

	/* Basic functions for framework */
	/* /We have defined the methods in this Class */
	
	
	public static Response getRequest(String requestUri) {

		RequestSpecification requestspecification = RestAssured.given();

		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.get(requestUri);

		return response;
	
			
		}

	public static Response postRequest(String requestUri, String requestPayload) {

		RequestSpecification requestspecification = RestAssured.given().body(requestPayload);

		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.post(requestUri);

		return response;

	}
	
	public static Response postRequest(String requestUri, String requestPayload , String bearer_Token) {

		RequestSpecification requestspecification = RestAssured.given().body(requestPayload);

		requestspecification.contentType(ContentType.JSON);
		requestspecification.header("Authorization", "Bearer",  bearer_Token);
		Response response = requestspecification.post(requestUri);

		return response;

	}
	public static Response putRequest(String requestUri, String requestPayload) {

		RequestSpecification requestspecification = RestAssured.given().body(requestPayload);

		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.put(requestUri);

		return response;

	}

	public static Response deleteRequest(String requestUri) {

		RequestSpecification requestspecification = RestAssured.given();

		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.delete(requestUri);

		return response;
	}

	public static Response deleteRequest_withPayload(String requestUri, String requestPayload) {

		RequestSpecification requestspecification = RestAssured.given().body(requestPayload);

		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.delete(requestUri);

		return response;
	}

}
