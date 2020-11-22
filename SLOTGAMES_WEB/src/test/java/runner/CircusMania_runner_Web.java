package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/CircusMania_AllUsecases_Web.feature", 
glue={"stepDefinition_CircusMania"},
plugin = {"pretty", "html:target/CucumberReport"})

public class CircusMania_runner_Web {

}
