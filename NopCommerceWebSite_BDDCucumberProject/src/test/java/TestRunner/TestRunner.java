package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//src//test//resources//Features//Login1.feature",
		".//src//test//resources//Features//Customers1.feature" }, glue = "stepDefinitions", dryRun = false, monochrome = true, plugin = {
				"pretty", "html:test-output" }, tags = { "@regression" })
public class TestRunner {

}
