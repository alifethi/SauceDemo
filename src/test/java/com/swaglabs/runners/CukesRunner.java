package com.swaglabs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/",

        // connection with feature folder and steps folder (providing the implementation)
        glue = "com.swaglabs.steps",

        // if true, it checks the undefined steps
        dryRun = false,

        tags = "@login",

        plugin = {
                "html:target/cucumber-default-report", //create a basic html report in target folder
                "json:target/cucumber.json",
                "rerun:target/failed.txt"
        }
)


public class CukesRunner {
}
