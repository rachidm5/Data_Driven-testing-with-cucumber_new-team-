package test_Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/main/resources/features_files",
        glue = {"stepDefinitions","hooks"},
//        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
//        dryRun = true,
//        strict = true,
        monochrome = true
//        tags = "@AdvancedSearchSearchIncluding"
)
public class TestRunner extends AbstractTestNGCucumberTests{
}
