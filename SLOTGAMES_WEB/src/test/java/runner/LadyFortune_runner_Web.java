package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\office\\SLOTGAMES_WEB\\SLOTGAMES_WEB\\features\\LadyFortune_AllUsecases_Web.feature", 
glue={"stepDefinition_LadyFortune"},
plugin = {"pretty", "html:target/CucumberReport"})



public class LadyFortune_runner_Web {

	

}
