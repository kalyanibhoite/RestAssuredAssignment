package com.api.test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import io.restassured.http.Header;

public class PostExample {
	private Header h1;
	private String id;
	
	static {
		baseURI = "https://reqres.in/api";
	}
	
	@BeforeMethod(description = "Initializing the headers")
	public void setup() {
	 h1 = new Header("Content-Type","application/json");
	}
	
	@Test(description = "test for post", groups = {"sanity","smoke"})
	public void Posttest() {
		
		
		       id = given()
		             .header(h1)
		          .and()
		             .body(getJsonObject(getJobDetailsPOJO()))
		             .log().all()
		          .when()
		              .post("users")
		           .then()
		               .log().all()
		           .assertThat()
		                .statusCode(201)
		           .and()
		                .body("name",equalTo("morpheus"))
		            .and()
		                .body("job",equalTo("leader"))
		           .and()
		                .extract().jsonPath().getString("id");
		                
		           System.out.println(id);
		}

}
