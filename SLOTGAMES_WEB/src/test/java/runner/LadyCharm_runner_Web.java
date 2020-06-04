package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\office\\SLOTGAMES_WEB\\SLOTGAMES_WEB\\features\\LadyCharm_AllUsecases_Web.feature", 
glue={"stepDefinition_LadyCharm"},
plugin = {"pretty", "html:target/CucumberReport"})


public class LadyCharm_runner_Web {

}
