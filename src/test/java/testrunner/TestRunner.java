package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features = "src/test/java/features",
		tags = "@toyoto",
		//dryRun=true,
		glue={"stepdefination"},
		//		plugin = { "pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json", "html:target/cucumber-reports", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
				plugin = { "pretty" , "html:target/cucumber-reports", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		)

public class TestRunner {

}



