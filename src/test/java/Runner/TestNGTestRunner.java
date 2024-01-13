package Runner;

import Capabilities.CapabilityBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features",
glue ="stepsDefinition" , tags="@Sanity")

public class TestNGTestRunner extends CapabilityBase{

}
