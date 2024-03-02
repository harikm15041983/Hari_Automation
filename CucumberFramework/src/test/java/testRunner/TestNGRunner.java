package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepdefinition", 
monochrome = true, dryRun = false, tags = "@HomeOfferPages", 
plugin = {"html:target/cucumbers.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestNGRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
