package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//For different dependecies
//import io.cucumber.CucumberOptions;
//import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA2022\\Selenium_Workspace\\CucumberProject\\src\\test\\java\\features\\login.feature"},//the path of the feature files
		glue={"stepDefinations"}//step Defination Package Name
		)


public class ScotiaTest {
	
	

}
