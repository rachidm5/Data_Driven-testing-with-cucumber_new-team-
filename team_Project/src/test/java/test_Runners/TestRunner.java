package test_Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/main/resources/features_files",
        glue = {"com/statefarm/project/qa/test/stepDefinitions", "com/statefarm/project/qa/test/base"},
//        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
//        dryRun = true,
//        strict = true,
        monochrome = true
//        tags = "@AdvancedSearchSearchIncluding"
)
public class TestRunner {
}
