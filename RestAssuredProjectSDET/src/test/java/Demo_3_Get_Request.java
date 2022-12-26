
import org.testng.Assert;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo_3_Get_Request {
	
	@Test
	public void getBookingId() {
		
		//Base URI
		RestAssured.baseURI ="https://restful-booker.herokuapp.com";
		
		//Request Object
		RequestSpecification httpRequest =  RestAssured.given();
		
		//Response object
		Response response =httpRequest.request(Method.GET,"/booking/2");
		
		
		//Printing in console
		
		
		String requestBody = response.getBody().asString();
		System.out.println("Request Body is " + requestBody );
		
		
		//Status code validation
		
		int statusCode = response.getStatusCode();
		System.out.println("Status code is " + statusCode);
		Assert.assertEquals(statusCode, 200);
		
		
		//Status line verification
		
		String statusLine = response.statusLine();
		System.out.println("Status line is " + statusLine );
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
