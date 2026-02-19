package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunnerClassForLogin {

	@CucumberOptions(
			features = "src/test/resources/Features/Logiin.feature",
			glue = "StepDefinitions",
			monochrome = true, 
			plugin = {"pretty", "html:target/cucumber-report.html" })
	public class LogiinSteps extends AbstractTestNGCucumberTests {
	}

}
