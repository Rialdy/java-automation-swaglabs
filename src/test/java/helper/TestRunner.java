package helper;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "",
        plugin = {"pretty","json:target/cucumber.json","html:target/report"})

public class TestRunner {
    
}
