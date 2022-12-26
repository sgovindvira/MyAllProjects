package DataDrivenTesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Drive_Exel {
	
	String sheetname = "Sheet1";

	
	@Test(dataProvider ="getTestEMPData")
	public void postNewEmployee(String EMPNAME, String EMPSAL, String EMPAGE) throws InterruptedException {
		
		RestAssured.baseURI ="https://dummy.restapiexample.com/api/v1";
		
		
		RequestSpecification httpRequest = RestAssured.given();
		
		//Creating JSON data
		JSONObject requestparams=new JSONObject();
		Thread.sleep(10000);//SERVER NOT ABLE TO HANDLE ALL REQUEST SO THATS WHY
		
		requestparams.put("name", EMPNAME);
		requestparams.put("salary", EMPSAL);
		requestparams.put("age", EMPAGE);
		
		//Adding header
		httpRequest.header("Content-Type", "application/json");
		
		//Add json to body of requesr
		
		httpRequest.body(requestparams.toJSONString());
		
		//Post REQUEST
		
		Response response = httpRequest.request(Method.POST,"/create");
		
		//Capturing request Body
		
		
		String responsebody = response.getBody().asPrettyString();
		System.out.println(responsebody);
		
		Assert.assertEquals(responsebody.contains(EMPNAME), true);
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	
	
	
	
	}
	@DataProvider
	public Object[] []getTestEMPData() {
		Object data[][] = TestUtil.getTestData(sheetname);
		return data;
	}
	

}
