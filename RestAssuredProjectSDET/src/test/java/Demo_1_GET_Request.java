
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo_1_GET_Request {
	
	// https://restful-booker.herokuapp.com/apidoc/index.html
	
	//Token  69a72043d22e8d6
	
	@Test
	void getWeatherDetails() {
		// Spcify URL
		RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		
		//Request Object
		RequestSpecification httpRequest = RestAssured.given();
		
		
		//Response Object
		Response response =httpRequest.request(Method.GET,"booking");
		
		//Printing response in consol
		
		String responseBody = response.getBody().asString();
		System.out.println("Response body is"  +  responseBody);
		
		// Status Code validationw
		int statusCode =	response.getStatusCode();
		System.out.println("Status code is " + statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//Status line verification
		String statusLine =	response.getStatusLine();
		System.out.println("Status line is " +statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		
		
	}
	
	
	
	

}
