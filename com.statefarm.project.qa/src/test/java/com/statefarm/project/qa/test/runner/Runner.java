package com.statefarm.project.qa.test.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        glue = { "com/statefarm/project/qa/test/base","com/statefarm/project/qa/test/stepDefinitions"},

        plugin = { "html:target/cucumber-reports/HTML_Report.html","json:target/cucumber-reports/JSON_Report.json",
                "junit:target/cucumber-reports/XML_Report.xml"},
        monochrome = true

        //     plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
    //  dryRun = true
//        strict = true,

//        tags = "@AdvancedSearchSearchIncluding"
)

public class Runner  {

}
