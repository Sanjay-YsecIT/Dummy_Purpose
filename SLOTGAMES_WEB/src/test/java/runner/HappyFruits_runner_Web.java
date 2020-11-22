package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/HappyFruits_AllUsecases_Web.feature", 
glue={"stepDefinition_HappyFruits"},
plugin = {"pretty", "html:target/CucumberReport"})

public class HappyFruits_runner_Web {

}
