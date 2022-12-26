import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo_2_POST_Request {
	
	
	@Test
	void createToken() {
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		
		// Request Object
		
		RequestSpecification httpRequest = RestAssured.given();
		
		
		//Request payload sending along with post request
		
		JSONObject request1 = new JSONObject();
		request1.put("username", "admin");
		request1.put("password", "password123");
		
		
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(request1.toJSONString());
		
		
		//Response Object
		Response response = httpRequest.request(Method.POST, "/auth");
		
		
		//Print response in console
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is " + responseBody);
		
		
		//Statuscode Validation
		
		int statusCode = response.getStatusCode();
		System.out.println("Status Code is " + statusCode );
		Assert.assertEquals(statusCode, 200);
		
		
		//Status Line
		String statusLine =	response.getStatusLine();
		System.out.println("Status line is " +statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		
		
		//Token = 69a72043d22e8d6
		
		
		
		
	}
	
	

}
