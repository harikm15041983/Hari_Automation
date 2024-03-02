package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="FeatureFiles/Login.feature", glue = "stepDefinitions")
public class RunnerClass {

	//It should combine the Feature File and Step Definition
	// Define Runner
}
