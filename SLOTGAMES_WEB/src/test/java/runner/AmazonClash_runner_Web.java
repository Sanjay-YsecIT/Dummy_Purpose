package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\office\\SLOTGAMES_WEB\\SLOTGAMES_WEB\\features\\AmazonClash_AllUsecases_Web.feature", 
glue={"stepDefinition_AmazonClash"},
plugin = {"pretty", "html:target/CucumberReport"})


public class AmazonClash_runner_Web {

}
