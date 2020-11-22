package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/FortySplendidHot_AllUsecases_Web.feature", 
glue={"stepDefinition_40SplendidHot"},
plugin = {"pretty", "html:target/CucumberReport"})

public class FortySplendidHot_runner_Web {

}