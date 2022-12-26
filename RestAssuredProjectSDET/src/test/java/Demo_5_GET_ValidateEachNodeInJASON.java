import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo_5_GET_ValidateEachNodeInJASON {
	
	@Test
	public void validateEachNode() {
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		
		
		//Request object
		RequestSpecification httpsRequest = RestAssured.given();
		
		//Response object
		Response response = httpsRequest.request(Method.GET, "/booking/1");
		
		JsonPath jsonpath = response.jsonPath();
		System.out.println(jsonpath.get("firstname"));//This info keep changing test might fail
		System.out.println(jsonpath.get("lastname"));
		System.out.println(jsonpath.get("totalprice"));
		System.out.println(jsonpath.get("depositpaid"));
		System.out.println(jsonpath.get("bookingdates"));
		
		Assert.assertEquals(jsonpath.get("firstname"), "Sally",  "Name is not matching");
		
		
		
		
		
		
		
		
	}

}
