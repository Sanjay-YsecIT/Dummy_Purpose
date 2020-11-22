package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/BrownieHot_AllUsecases_Web.feature", 
glue={"stepDefinition_BrownieHot"},
plugin = {"pretty", "html:target/CucumberReport"})

public class BrownieHot_runner_Web {

}