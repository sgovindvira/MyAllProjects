package DataDrivenTesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDriveTes_Add_New_Employee {

	
	@Test(dataProvider ="dataProvider")
	public void postNewEmployee(String ename,String esal,String eage) throws InterruptedException {
		
		RestAssured.baseURI ="https://dummy.restapiexample.com/api/v1";
		
		
		RequestSpecification httpRequest = RestAssured.given();
		
		//Creating JSON data
		JSONObject requestparams=new JSONObject();
		Thread.sleep(5000);
		
		requestparams.put("name", ename);
		requestparams.put("salary", esal);
		requestparams.put("age", eage);
		
		//Adding header
		httpRequest.header("Content-Type", "application/json");
		
		//Add json to body of requesr
		
		httpRequest.body(requestparams.toJSONString());
		
		//Post REQUEST
		
		Response response = httpRequest.request(Method.POST,"/create");
		
		//Capturing request Body
		
		
		String responsebody = response.getBody().asPrettyString();
		System.out.println(responsebody);
		
		Assert.assertEquals(responsebody.contains(ename), true);
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		
		
	}
	
	
	
	@DataProvider(name = "dataProvider")
	String[][] getempdata()
	{
		String [][] empdata = {{"ABC","30000","20"}, {"XYZ","20000","20"},{"PQR","40000","20"}};
		return(empdata);
	}

}
