package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\office\\SLOTGAMES_WEB\\SLOTGAMES_WEB\\features\\SapphireHeart_AllUsecases_Web.feature", 
glue={"stepDefinition_SapphireHeart"},
plugin = {"pretty", "html:target/CucumberReport"})


public class SapphireHeart_runner_Web {

}
