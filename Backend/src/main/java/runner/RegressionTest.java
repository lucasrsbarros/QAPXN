package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"steps"},
        plugin = {"pretty","html:Reporter/report.html"}
        //publish = true
)
public class RegressionTest {
}
