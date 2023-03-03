package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features = ".//Features/AddCustomer.feature",
		glue = "stepDefinitions",
		dryRun = false,
		plugin = {"pretty", 
		"html:test-output.html"		
		},
		monochrome=true
		
		)
public class TestRun {

	
	
	
}
