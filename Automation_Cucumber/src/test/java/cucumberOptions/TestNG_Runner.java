package cucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features", 
		glue="stepDefinitions", monochrome = true, tags = "@GetListofValue or @Parameterisation", dryRun = false,
plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
//AbstractTestNGCucumberTests

public class TestNG_Runner extends AbstractTestNGCucumberTests{
	
}