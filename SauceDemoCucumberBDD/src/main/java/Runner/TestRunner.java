package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\QA2022\\Selenium_Workspace\\SauceDemoCucumberBDD\\src\\main\\java\\feature\\loginUsingExample.feature"
		,glue= {"StepDefinitions"},
		plugin = { "pretty", "html:target/cucumber-reports" , "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		dryRun = true
	//  tag ={"@SmokeTest"}

		)

//Cucumber options
// 1. Dry Run  = Mapping between stepdefinition and feature file. If method is missing then can map out
//2. Feature = Where feature file is located
// 3. Glue = the path of stepdefinitions
//4. monochrome = display the console output in a readable format
//5. Strict = it will check if any step is not defined in step definition file
// 6.Tag = we can provide tag name such as @smoketest @reggression etc     ~@Smoketest to ignore this test case

//7. Hooks = @Before @After annotation import from cucumber
// 8. Tagged Hooks: 
// 9. Ordering Hooks





public class TestRunner {

}
