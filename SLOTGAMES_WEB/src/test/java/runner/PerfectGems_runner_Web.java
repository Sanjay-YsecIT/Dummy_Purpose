package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/PerfectGems_AllUsecases_Web.feature", 
glue={"stepDefinition_PerfectGems"},
plugin = {"pretty", "html:target/CucumberReport"})

public class PerfectGems_runner_Web {

}
