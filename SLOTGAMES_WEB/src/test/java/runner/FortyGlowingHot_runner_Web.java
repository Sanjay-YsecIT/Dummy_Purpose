package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\office\\SLOTGAMES_WEB\\SLOTGAMES_WEB\\features\\FortyGlowingHot_AllUsecases_Web.feature", 
glue={"stepDefinition_40GlowingHot"},
plugin = {"pretty", "html:target/CucumberReport"})

public class FortyGlowingHot_runner_Web {

}
