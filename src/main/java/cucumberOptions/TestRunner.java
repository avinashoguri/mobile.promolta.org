package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(

		features="src/main/java/features/Payments.feature",
		glue="mobile_stepDefenations",
		format= {"pretty","html:test-htmloutput","json:json_output/cucumber.json"},
		monochrome = true,
		dryRun = true)
		


public class TestRunner extends AbstractTestNGCucumberTests{



}

