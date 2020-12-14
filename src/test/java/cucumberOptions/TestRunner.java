package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\features", // Pass the path to features file
		glue = "stepDefinations") // pass name of package that holds the definition file. note: it should be part of same folder.

public class TestRunner {

}
