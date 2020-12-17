package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/TropicalForest_AllUsecases_Web.feature", 
glue={"stepDefinition_TropicalForest"},
plugin = {"pretty", "html:target/CucumberReport"})

public class TropicalForest_runner_Web {

}
