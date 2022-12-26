import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo_4_GET_Validating_JSON_Response {
	
	
	@Test
	public void validateJSONResponse() {
		
		RestAssured.baseURI ="https://restful-booker.herokuapp.com";
		
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		
		//Response Object
		Response response = httpRequest.request(Method.GET, "/booking/1");
		
		//Printing response body
		String responseBody = response.getBody().asPrettyString();
		System.out.println("Response Body is  " + responseBody);
		
		
		Assert.assertEquals(responseBody.contains("Eric"), true);
		Assert.assertEquals(responseBody.contains("Smith"), true);
		
		
		
		
		
		
	}
	
	

}
