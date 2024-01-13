package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/", dryRun=true,monochrome=true,
					glue ="stepsDefinition",stepNotifications = true, tags="@Sanity",
					plugin= {"pretty","html:target/cucumber.html","json:target/Cucumber.json","junit:target/Cucumber.xml"})

public class TestRunner {

}
