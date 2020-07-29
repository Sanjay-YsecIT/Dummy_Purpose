package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\office\\SLOTGAMES_WEB\\SLOTGAMES_WEB\\features\\UltraHot_AllUsecases_Web.feature", 
glue={"stepDefinition_UltraHot"},
plugin = {"pretty", "html:target/CucumberReport"})

public class UltraHot_runner_Web {

}
