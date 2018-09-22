package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kunal\\workspace\\CRM_Cucumber\\src\\main\\java\\Feature1", glue = {"stepDefination"})
public class TestRunner {

}
