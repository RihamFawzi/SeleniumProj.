package runner;

 


import io.cucumber.testng.CucumberOptions;
import stepDefinitions.TestBase;

 


@CucumberOptions (features = "src/test/java/features", glue= "stepDefinitions" , plugin = {"pretty","html:target/cucumber-html-report"}, tags = "@regression")

 

 

public class Runner extends TestBase {


}