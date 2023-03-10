package com.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/qa/steps",
        dryRun = false,
        tags = "@smoke",
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber-default-report",
                "json:target/cucumber.json",
                "rerun:target/failed.txt"
        }

)
public class TestRunner {

}
