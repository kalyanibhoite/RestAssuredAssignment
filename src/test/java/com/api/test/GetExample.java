package com.api.test;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;

public class GetExample {
	private String data;
	
	static {
		
		baseURI = "https://reqres.in/api";
	}
	

	@Test(description = "test for get", groups = {"sanity","smoke"})
	public  void gettest () {
		
		 data = given()
		.when()
		    .get("users?page=2")
	    .then()
	       .log().all()
	   .assertThat()
	        .statusCode(200)
	     .and() 
	     .body("data[0].first_name",equalTo("Michael"))
	     .and()
	       .extract().jsonPath().getString("data");
		System.out.println(data);
	 	
		
	}
	
}
