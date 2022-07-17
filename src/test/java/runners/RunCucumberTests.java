package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class for parallel excution
@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/resources"}, glue= {"steps"}, plugin = {"pretty", "json:target/cucumber-report/cucumber.json",
        "html:target/cucumber-report/cucumber.html"})
public class RunCucumberTests {
}
