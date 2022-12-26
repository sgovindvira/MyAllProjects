package Runner;


	

	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features= "C:\\QA2022\\Selenium_Workspace\\SauceDemoCucumberBDD\\src\\main\\java\\feature\\LoginUsingTables.feature"
			,glue= {"StepDefinitions"},
			plugin = { "pretty", "html:target/cucumber-reports" , "junit:junit_xml/cucumber.xml"},
			monochrome = true,
			dryRun = false
			)

	//Cucumber options
	// 1. Dry Run  = Mapping between stepdefinition and feature file. If method is missing then can map out
	//2. Feature = Where feature file is located
	// 3. Glue = the path of stepdefinitions
	//4. monochrome = display the console output in a readable format
	//5. Strict = it will check if any step is not defined in step definition file



	public class TestRunnerforTableFeatureFile {

	}


