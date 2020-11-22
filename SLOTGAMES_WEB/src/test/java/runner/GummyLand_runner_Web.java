package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/GummyLand_AllUsecases_Web.feature", 
glue={"stepDefinition_GummyLand"},
plugin = {"pretty", "html:target/CucumberReport"})

public class GummyLand_runner_Web {

}
