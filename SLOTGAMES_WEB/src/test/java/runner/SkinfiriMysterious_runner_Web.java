package runner;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/SkinfiriMysterious_AllUsecases_Web.feature", 
glue={"stepDefinition_SkinfiriMysterious"},
plugin = {"pretty", "html:target/CucumberReport"})

public class SkinfiriMysterious_runner_Web {

}