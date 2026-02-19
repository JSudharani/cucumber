package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
			features = "src/test/resources/Features/OpenGoogle.feature",
			glue = "StepDefinitions",
			monochrome = true, 
			plugin = {"pretty", "html:target/cucumber-report.html" })
	public class TestRunnerForOpenGoogle extends AbstractTestNGCucumberTests {
	}


   
