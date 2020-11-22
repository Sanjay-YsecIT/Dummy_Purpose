package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/TropicanaCasine_AllUsecases_Web.feature", 
glue={"stepDefinition_TropicanaCasine"},
plugin = {"pretty", "html:target/CucumberReport"})

public class TropicanaCasine_runner_Web {

}
