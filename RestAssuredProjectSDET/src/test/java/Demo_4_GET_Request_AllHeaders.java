import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo_4_GET_Request_AllHeaders {
	
	@Test
	public void getAllHeaders() {
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		
		
		
	//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Request object
		
		Response response = httpRequest.request(Method.GET,"/booking/1");//try here 2,3,4,5
		
		//Print response in body
		
		String responseBody = response.getBody().asPrettyString();
		System.out.println("Response Body is "  +responseBody );
		
		
		
		//Printing single header
		
		String Server = response.header("Server");
		System.out.println("Server header is  " + Server);
		Assert.assertEquals(Server, "Cowboy");
		
		//Printing all Headers
		
		
		Headers allHeaders = response.headers();
		
		for(Header header:allHeaders) {
			System.out.println(header.getName() +" = " + header.getValue());
		}
		
		
	}
	

}
